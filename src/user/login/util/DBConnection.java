
package user.login.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/shohel";
    private static final String DB_USRNAME = "root";
    private static final String DB_PASSWORD = "root";
    
    static Connection  con;
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER_CLASS);
            con = DriverManager.getConnection(DB_URL, DB_USRNAME, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
