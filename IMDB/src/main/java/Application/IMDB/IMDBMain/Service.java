package Application.IMDB.IMDBMain;

import java.util.HashMap;
import java.util.Map;

import Application.IMDB.Framework.MWRequest;
import Application.IMDB.Framework.MWWrapperService;

@org.springframework.stereotype.Service
public class Service extends MWWrapperService{

	@Override
	public MWRequest prepare_EAI_Request(Object Request) {
		
		MWRequest mwRequest = new MWRequest();
		
		mwRequest.setRequest(Request);
		mwRequest.setUrl("http://localhost:8080/imdb");
		Map<String, String> header = new HashMap<>();
		header.put("Content-Type", "application/json");
		mwRequest.setHeaders(header);
		System.out.println("prepare req -->>" + mwRequest.toString());
		return mwRequest;
	}

	@Override
	public void prepare_EAI_Response(String responseStr) {
		System.out.println(responseStr);
		
	}
	

}
