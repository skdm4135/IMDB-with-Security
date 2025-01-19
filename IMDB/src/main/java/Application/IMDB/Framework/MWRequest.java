package Application.IMDB.Framework;

import java.util.Map;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MWRequest {
	
	private String url;
	private Map<String, String> headers;
	private Object request;
	private String serviceID;
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "MWRequest [url=" + url + ", headers=" + headers + ", request=" + request + ", serviceID=" + serviceID
				+ "]";
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public Object getRequest() {
		return request;
	}
	public void setRequest(Object request) {
		this.request = request;
	}
	
	

}
