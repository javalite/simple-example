# ActiveJDBC example showing Many-To-Many
 
 This example shows a typical usage of ActiveJDBC in a Many-to-Many
  relationship where a join table is also used to record some metadata for 
  each relationship


Usage:


* Adjust your database connection parameters in file:
 
```
    src/main/resources/database.properties
```

* Execute database migrations: 

```
    mvn db-migrator:create
    mvn db-migrator:migrate
```

* Build program: 

```
    mvn clean install
```
    
* Execute: 


```
# this will collect all dependencies under target dir.
mvn dependency:unpack-dependencies

# Execute the program from command line:
# Linux:
java -classpath target/dependency:target/classes activejdbc.examples.simple.Main
# Windows:
java -classpath target\dependency;target\classes activejdbc.examples.simple.Main 

# Same with ActiveJDBC logging turned on:
java -classpath target/dependency:target/classes -Dactivejdbc.log activejdbc.examples.simple.Main
```

* Examine the output: 

Line similar to this at the end: 

```
Model: activejdbc.examples.simple.Movie, table: 'movies', attributes: {id=1, title=Saving private Ryan, year=1998}
Model: activejdbc.examples.simple.Movie, table: 'movies', attributes: {id=2, title=Jaws, year=1982}
```


## Instrumentation

If you run  this example from an IDE, you will need to instrument models before running. Here is how: 

    mvn process-classes
 
 another way of doing the same is: 
 
    mvn activejdbc-instrumentation:instrument


