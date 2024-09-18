
package bank.management.system;
import java.sql.*;
public class conn {
    
    //Create Connection
    Connection c;
    Statement s;
    public conn(){
        try {
            
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","admin");
            s = c.createStatement();
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    //Register the Driver
    
    
}
