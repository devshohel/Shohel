/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.wnur.util;

import w.login.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author md.woalinur
 */
public class DBConnection {
    static Connection con;
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/productmgt";
            String user = "root";
            String pass = "root";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
