package Application.IMDB.Framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import Application.IMDB.IMDBMain.IMDBEntity;

@Configuration
public abstract class MWWrapperService {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public abstract MWRequest prepare_EAI_Request (Object Request);
	
	public abstract MWResponse prepare_EAI_Response(String responseStr);
	
	public MWResponse doControl(Object Request) {
		
		
		
		MWRequest mwRequest = prepare_EAI_Request(Request);
		String serviceID =  mwRequest.getServiceID();
		
		
		String url_prop = "IMDB."+serviceID+".url";
		String url = environment.getProperty(url_prop);
			
		System.out.println("-------------URL ------------" + url);
				
		HttpHeaders headers = new HttpHeaders();
		mwRequest.getHeaders().forEach(headers::set);
		
		HttpEntity<Object> req = new HttpEntity<Object>(mwRequest.getRequest(),headers);
		
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, req, String.class);
		
		return prepare_EAI_Response(responseEntity.getBody());
		
		
	}
}
