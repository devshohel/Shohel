
package user.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import user.login.util.DBConnection;
import user.login.model.User;

public class UserDAO {
    Connection con;
    
    public int insert(User u){
        con = DBConnection.getConnection();
        int status = 0;
        if(getByUsername(u)){
            status = 0;
        }else{
            try {
                String sql = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, u.getName());
                pst.setString(2, u.getUsername());
                pst.setString(3, u.getPassword());
                status = pst.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return status;   
    }
    
    
    private boolean getByUsername(User u) {
        con = DBConnection.getConnection();
        boolean userExists = false;
        
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userExists = true;
            } else {
                userExists = false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return userExists;
    } 

    
    
    public User checkLogin(User u) {
        con = DBConnection.getConnection();
        User user = new User();
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return user;
        
    }
}
