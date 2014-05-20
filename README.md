# Maven-based example using ActiveJDBC.
Usage:

*  Execute `create.sql` against your DB - this will create a table. 
*  Execute the following command: 

```
mvn clean package  exec:java -Dexec.mainClass="activejdbc.examples.simple.SimpleExample"
```
* Examine the output



