package activejdbc.examples.simple;

import org.javalite.activejdbc.Model;

import java.util.List;

public class Employee extends Model {
    static{
        validatePresenceOf("first_name", "last_name");
    }


    public static void doSomething(List<Employee> employees) {
        for (Employee r : employees)
            System.out.println(r.getId());

        employees.forEach((Employee record) -> System.out.println(record.getId()));
    }

}
