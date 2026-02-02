/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import product3.model.Product;
import product.util.DBConnection;

/**
 *
 * @author ahamm
 */
public class ProductService {
    Connection con;

    public int save(Product p) throws SQLException {
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
    
}
