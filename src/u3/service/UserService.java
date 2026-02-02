/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import u3.model.User;
import u3.util.DBConnection;

/**
 *
 * @author ahamm
 */
public class UserService {
    Connection con;

    public int save(User u) throws SQLException {
        con = DBConnection.getConnection();
        String sql = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, u.getName());
        ps.setString(2, u.getUsername());
        ps.setString(3, u.getPassword());
        int status = ps.executeUpdate();
        return status;
    }
    
    public User checkLogin(User u) throws SQLException{
        con = DBConnection.getConnection();
        User user = new User();
        String sql = "SELECT * FROM users WHERE username = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, u.getUsername());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
        }
        return user;
    }
    
}
