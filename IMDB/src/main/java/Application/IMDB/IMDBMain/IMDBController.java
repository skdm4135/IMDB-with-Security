package Application.IMDB.IMDBMain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imdb")
public class IMDBController {
	
	@Autowired
	private IMDBRepo imdbRepo;
	
	@GetMapping
	public List<IMDBEntity> getAll() {
		return imdbRepo.findAll();
	}
	
	@PostMapping
	public IMDBEntity addAll(@RequestBody IMDBEntity entity) {
		return imdbRepo.save(entity);
		
	}
}
