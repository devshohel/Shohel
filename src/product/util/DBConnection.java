/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ahamm
 */
public class DBConnection {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/shohel";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    
    static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER_CLASS);
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
