
package studentmgt.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Load the JDBC Driver
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "root";
            //Connection to database
            con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
