/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product2.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import product2.model.Product;
import product2.util.DBConnection;

/**
 *
 * @author SHOHEL
 */
public class ProductService {
    Connection con;
    
    public int save(Product p) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "INSERT INTO product (pid, pname, qty, price) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, p.getPid());
        ps.setString(2, p.getPname());
        ps.setInt(3, p.getQty());
        ps.setDouble(4, p.getPrice());
        
        int status = ps.executeUpdate();
        return status;
    }
    
    public int update(Product p) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "UPDATE product SET pname = ?, qty = ?, price = ? WHRER pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getPname());
        ps.setInt(3, p.getQty());
        ps.setDouble(4, p.getPrice());
        
        int status = ps.executeUpdate();
        return status;
    }
    
    public int delete(int pid) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "DELETE FROM product WHERE pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pid);
        int status = ps.executeUpdate();
        return status;
    }
    
    public Product getById(int pid) throws SQLException{
        con = DBConnection.getConnection();
        String sql = "SELECT * FROM product WHERE pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pid);
        ResultSet rs = ps.executeQuery();
        Product p = new Product();
        while (rs.next()) {            
            p.setPname(rs.getString("pname"));
            p.setQty(rs.getInt("pid"));
            p.setPrice(rs.getDouble("price"));
        }
        return p;
    }
    
    public List<Product> getAll() throws SQLException{
        con = DBConnection.getConnection();
        String sql = "SELECT * FROM product";
        PreparedStatement ps = con.prepareStatement(sql);
        List product = new ArrayList();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            Product p = new Product();
            p.setPid(rs.getInt("pid"));
            p.setPname(rs.getString("pname"));
            p.setQty(rs.getInt("qty"));
            p.setPrice(rs.getDouble("price"));
            
            product.add(p);
        }
        return product;
    }
    
    public ResultSet getResultSet() throws SQLException{
    con = DBConnection.getConnection();
    String sql = "SELECT * FROM product";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
        return rs ;
    }
}
