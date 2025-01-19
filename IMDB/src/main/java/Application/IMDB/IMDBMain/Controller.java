package Application.IMDB.IMDBMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Application.IMDB.Framework.MWResponse;
import Application.IMDB.Framework.MWWrapperService;

@RestController
@RequestMapping("/service")
public class Controller {
	
	@Autowired
	private MWWrapperService mwWrapperService;
	
	@PostMapping
	public String getAll(@RequestBody IMDBEntity request) {
		MWResponse mwResponse =  mwWrapperService.doControl(request);
		return mwResponse.getResponse();
	}
}
