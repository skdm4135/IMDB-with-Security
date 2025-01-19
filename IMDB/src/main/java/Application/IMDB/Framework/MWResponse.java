package Application.IMDB.Framework;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class MWResponse {
	
	private String response;

	@Override
	public String toString() {
		return "MWResponse [response=" + response + "]";
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
}
