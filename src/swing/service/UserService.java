
package swing.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import swing.model.User;
import swing.util.DBConnection;


public class UserService {
    Connection con;
    Statement stmt;
    
    public int addUser(User u){
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO user (username, password) VALUES ('"+u.getUsername()+"','"+u.getPassword()+"')";
            return stmt.executeUpdate(sql);
        } catch (Exception e) {
            return 0;
        }
    
    }
    
    public int loginUser(User u){
        try {
            System.out.println("enter");
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            String sql = "SELECT * FROM user WHERE username = '"+u.getUsername()+"'";
            ResultSet rs = stmt.executeQuery(sql);
            rs.absolute(1);
            if (u.getPassword().equals(rs.getString("password"))) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }


}
