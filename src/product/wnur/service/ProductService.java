/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.wnur.service;

import w.login.util.DBConnection;
import w.login.model.ProductModel;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author md.woalinur
 */
public class ProductService {
    Connection con;
    
    public int save (ProductModel p) throws SQLException{
        
        String sql = "INSERT INTO products(pid,name,qty,price) VALUES (?,?,?,?)";
        con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, p.getPid());
        ps.setString(2, p.getName());
        ps.setInt(3, p.getQty());
        ps.setDouble(4, p.getPrice());
        int status = ps.executeUpdate();
        return status;
    
    }
    public ResultSet show () throws SQLException{
        con = DBConnection.getConnection();
       String sql = "SELECT * FROM Products";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        return rs;
}
     public int update (ProductModel p) throws SQLException{
        
        String sql = "UPDATE products SET name = ? , qty = ? , price = ? WHERE pid = ?";
        con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
       
        ps.setString(1, p.getName());
        ps.setInt(2, p.getQty());
        ps.setDouble(3, p.getPrice());
        ps.setInt(4, p.getPid());
         
        int status = ps.executeUpdate();
        return status;
    
    }
       public ProductModel edit (int p) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "SELECT * FROM products WHERE pid = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
       ps.setInt(1, p);
       
        ResultSet rs = ps.executeQuery();
        ProductModel pm = new ProductModel();
        while(rs.next()){
        pm.setName(rs.getString("name"));
        pm.setQty(rs.getInt("qty"));
        pm.setPrice(rs.getDouble("price"));
        }
         
        
        return pm;
    
    }
     
      public int delete (int p) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "DELETE FROM products WHERE pid = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, p);
       
        int status = ps.executeUpdate();
        return status;
    
    }
}
