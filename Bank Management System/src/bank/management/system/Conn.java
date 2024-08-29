package bank.management.system;

import java.sql.*;

public class Conn {
   
    Connection c;
    Statement s;
    public Conn() {
       try {
           //Class.forName(com.mysql.cj.jdbc.Driver); //step 1
           c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "@jeet23Meena");
           s = c.createStatement();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}
/*5 step in connectivity
Register the Driver
Create connection
create statement
execute query
close conneection*/