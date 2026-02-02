/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import u.model.Customer;
import u.util.DBConnection;

/**
 *
 * @author ahamm
 */
public class CustomerDAO {
    
    Connection con;

    
    public int insert(Customer c) {
        con = DBConnection.getConnection();
        int status = 0;
        if (getByUsername(c)) {
            status = 0;
        } else {
            try {
            String sql = "INSERT INTO customer(name, username, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getUsername());
            ps.setString(3, c.getPassword());
            status = ps.executeUpdate();
            } catch (SQLException e) {
                    System.out.println(e);
            }
        }

        return status;
    }
    
    private boolean getByUsername(Customer c){
        con = DBConnection.getConnection();
        boolean customerExists = false;
        
        try {
            String sql = "SELECT * FROM customer WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getUsername());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                customerExists = true;
            } else {
                customerExists = false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return customerExists;
    }
    
    public Customer checkLogin (Customer c){
        con = DBConnection.getConnection();
        Customer customer = new Customer();
        try {
            String sql = "SELECT * FROM customer WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getUsername());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
                customer.setName(rs.getString("name"));
                customer.setUsername(rs.getString("username"));
                customer.setPassword(rs.getString("password"));
               
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customer;
    }
    
}
