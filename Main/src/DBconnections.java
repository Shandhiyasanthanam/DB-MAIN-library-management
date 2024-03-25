import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnections
{ 
        private DBconnections(){
                
        }
        public static Connection con;

public static Connection getConnections() throws SQLException, ClassNotFoundException
{
   
       try {
                con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/Library","root","123456789");  
        }
        catch(Exception e) {
                e.printStackTrace();
        }
        return con;
}
}