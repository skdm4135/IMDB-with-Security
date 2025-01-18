package Application.IMDB.IMDBMain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMDBRepo extends JpaRepository<IMDBEntity, Long>{
	
	Optional<IMDBEntity> findById(Long id);
}
