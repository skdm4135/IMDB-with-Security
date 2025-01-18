package Application.IMDB.IMDBMain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;

import java.util.List;

@Entity
@Table(name = "IMDB_Table")
public class IMDBEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "year_of_release")
    private int yearOfRelease;

    @Column(name = "imdb_rating")
    private double imdbRating;

    @Column(name = "director")
    private String director;
    
    @Convert(converter = CastConverter.class)
    @Column(name = "cast")
    private List<IMDBCastEntity> cast; 


    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<IMDBCastEntity> getCast() {
        return cast;
    }

    @Override
	public String toString() {
		return "IMDBEntity [id=" + id + ", movieName=" + movieName + ", yearOfRelease=" + yearOfRelease
				+ ", imdbRating=" + imdbRating + ", director=" + director + ", cast=" + cast + "]";
	}

	public void setCast(List<IMDBCastEntity> cast) {
        this.cast = cast;
    }
    
 // Default constructor
    public IMDBEntity() {}

    public IMDBEntity(String movieName, int yearOfRelease, double imdbRating, String director, List<IMDBCastEntity> cast) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.imdbRating = imdbRating;
        this.director = director;
        this.cast = cast;
    }
}
