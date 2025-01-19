package Application.IMDB.Framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
public abstract class MWWrapperService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public abstract MWRequest prepare_EAI_Request (Object Request);
	
	public abstract void prepare_EAI_Response(String responseStr);
	
	public void doControl(Object Request) {
		
		MWRequest mwRequest = prepare_EAI_Request(Request);
		
		HttpHeaders headers = new HttpHeaders();
		mwRequest.getHeaders().forEach(headers::set);
		
		HttpEntity<Object> req = new HttpEntity<Object>(mwRequest.getRequest(),headers);
		
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(mwRequest.getUrl(), req, String.class);
		
		prepare_EAI_Response(responseEntity.getBody());
		
		
	}
}
