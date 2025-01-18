package Application.IMDB.IMDBMain;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class IMDBCastEntity {

    private String actor;
    private String actress;
    private String supportingActor;
    private String supportingActress;

    // Default constructor
    public IMDBCastEntity() {}

    // Parameterized constructor
    public IMDBCastEntity(String actor, String actress, String supportingActor, String supportingActress) {
        this.actor = actor;
        this.actress = actress;
        this.supportingActor = supportingActor;
        this.supportingActress = supportingActress;
    }

    // Getters and setters
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getSupportingActor() {
        return supportingActor;
    }

    public void setSupportingActor(String supportingActor) {
        this.supportingActor = supportingActor;
    }

    public String getSupportingActress() {
        return supportingActress;
    }

    public void setSupportingActress(String supportingActress) {
        this.supportingActress = supportingActress;
    }

    public String toString() {
        return "Cast{" +
                "actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", supportingActor='" + supportingActor + '\'' +
                ", supportingActress='" + supportingActress + '\'' +
                '}';
    }
}
