package activejdbc.examples.simple;

import org.javalite.activejdbc.Model;

/**
 * @author Igor Polevoy on 11/16/15.
 */
public class Movie extends Model {

    static {
        validatePresenceOf("title", "year");
    }

    public Movie() {}

    public Movie(String title, int year) {
        set("title", title, "year", year);
    }

    public String getTitle(){
        return getString("title");
    }
}
