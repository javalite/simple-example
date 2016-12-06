package activejdbc.examples.simple;

import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.test.DBSpec;
import org.junit.Test;

import java.util.List;

/**
 * @author igor on 12/2/16.
 */
public class MovieSpec extends DBSpec{


    @Test
    public void shouldValidateMovieAttributes(){
        Movie movie = new Movie();
        the(movie).shouldNotBe("valid");
        movie.set("title", "blah", "year", "1122");
        the(movie).shouldBe("valid");
    }




        @Test
    public void shouldStoreDirectorAndMovies(){

        Person director  = new Person("Stephen Spielberg");
        director.saveIt();

        director.add(new Movie("Saving private Ryan", 1998));
        director.add(new Movie("Jaws", 1982));

        a(MoviesPeople.count()).shouldBeEqual(2);

        List<Movie> movies = director.getAll(Movie.class).orderBy("year");

        the(movies.get(0).getTitle()).shouldBeEqual("Jaws");
        the(movies.get(1).getTitle()).shouldBeEqual("Saving private Ryan");
    }
}
