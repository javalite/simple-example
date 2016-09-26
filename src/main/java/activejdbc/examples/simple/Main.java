package activejdbc.examples.simple;

import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Configuration;
import org.javalite.activejdbc.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Base.open();

        Movie movie = new Movie();

        movie.save();

        System.out.println(movie.getId());

        Person director  = new Person("Stephen Spielberg");
        movie.addPerson(director, Person.TYPE.director);

        movie.get(Person.class, "type = ? ", Person.TYPE.director.name()).forEach(System.out::println); // Java 8

        Base.close();
    }
}
