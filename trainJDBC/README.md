## JDBC - Train Database (IRCTC)

`IRCTC` is a local database I created on my local system. It a sample and very short database I created to run some basic commands in the JVM / JRE.

The current JDBC runs on `JRE-1.8`.

I imported the `mysql-connector` jar file to use all the required classes. The classpath of the library is set accordingly.


## Steps / Flow

Using the concept of OOPs the following methodology was used to do the JDBC:

`pojo`:
Creating a plain old java object (pojo) for each table in the database. Create variables of every column. Do constructor overloading and create getter & setter methods.  Also override the toString() method if required.

`dao`:
Create data access object (dao)  - interface which will have various abstract methods. Based on requirement, there can be multiple methods to perform query operations as well as crud operations.

`daoimpl`:
Override the dao using implementation. Put the code for the required output in this impl.

`db-connection`:
Create a database connection class. This will be the default code for calling a connection in try-with-resource block. Using the java.sql.Connection class create a connection. Inherit the connection requirements such as driver, dbname, user, password from a public interface.

`db-details`:
Create a public interface to store the driver, dbname, username & password. This will be used in the connection directly.
