package activejdbc.examples.simple;

import org.javalite.activejdbc.Model;

/**
 * @author Igor Polevoy on 11/16/15.
 */
public class Movie extends Model {

    public Movie() {}

    public Movie(String title) {
        set("title", title);
    }

    public void addPerson(Person person, Person.TYPE type) {
        if(!person.exists()){
            person.saveIt(); // will generate ID
        }
        MoviesPeople mp = new MoviesPeople();
        mp.set("type", type.name());
        mp.set("person_id", person.getId());
        mp.set("movie_id", getId());
        mp.saveIt();
    }
}
