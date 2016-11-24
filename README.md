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
mvn clean package  exec:java -Dexec.mainClass="activejdbc.examples.simple.Main" -Dexec.cleanupDaemonThreads=false
```

* Examine the output: 

Line similar to this at the end: 

```
Model: activejdbc.examples.simple.Person, table: 'people', attributes: {id=4, name=Stephen Spielberg}
```


## Instrumentation

If you run  this example from an IDE, you will need to instrument models before running. Here is how: 

    mvn process-classes
 
 another way of doing the same is: 
 
    mvn activejdbc-instrumentation:instrument


