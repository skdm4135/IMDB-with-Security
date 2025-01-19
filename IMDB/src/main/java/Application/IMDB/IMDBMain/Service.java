package Application.IMDB.IMDBMain;

import java.util.HashMap;
import java.util.Map;

import Application.IMDB.Framework.MWRequest;
import Application.IMDB.Framework.MWResponse;
import Application.IMDB.Framework.MWWrapperService;

@org.springframework.stereotype.Service
public class Service extends MWWrapperService {

	@Override
	public MWRequest prepare_EAI_Request(Object Request) {
		MWRequest mwRequest = new MWRequest();

		mwRequest.setRequest(Request);
		mwRequest.setServiceID("service");
		Map<String, String> header = new HashMap<>();
		header.put("Content-Type", "application/json");
		mwRequest.setHeaders(header);
		System.out.println("prepare req -->>" + mwRequest.toString());
		return mwRequest;
	}

	@Override
	public MWResponse prepare_EAI_Response(String responseStr) {
		MWResponse mwResponse = new MWResponse();
		System.out.println(responseStr);
		mwResponse.setResponse(responseStr);
		return mwResponse;
	}

}
