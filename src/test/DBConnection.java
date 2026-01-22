package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

    public static void main(String[] args) {
        Connection con = null;
        try {
//            int id = 104;
//            String fname = "Hasanujjaman";
//            String lname = "Sagor";
//            double salary = 4500.25;

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "root";
            con = DriverManager.getConnection(url, user, password);

//            //-------------Insert-------------------------
//            String inSql = "INSERT INTO EMPLOYEE3(emp_id, f_name, l_name, salary) VALUES(?,?,?,?)";
//            PreparedStatement pst = con.prepareStatement(inSql);
//            pst.setInt(1, 106);
//            pst.setString(2, "Raihan");
//            pst.setString(3, "Roni");
//            pst.setDouble(4, 48000.20);
//            int status = pst.executeUpdate();
//            
//            if (status > 0) {
//                System.out.println("Inserted");
//            } else {
//                System.out.println("Insert fail");
//            }
//            pst.close();
//            con.close();
//            //-------------Update---------------
//            String upSql = "UPDATE EMPLOYEE3 SET f_name = ?, l_name = ? WHERE emp_id = ?";
//            PreparedStatement ppst = con.prepareStatement(upSql);
//            ppst.setString(1, "Akib");
//            ppst.setString(2, "Uddin");
//            ppst.setInt(3, 102);
//            int sstatus = ppst.executeUpdate();
//            if (sstatus > 0) {
//                System.out.println("Updated");
//            } else {
//                System.out.println("Update fail");
//            }
//            ppst.close();
//            con.close();
//            //---------------Delete--------------
//            String dSql = "DELETE FROM EMPLOYEE3 WHERE emp_id = ?";
//            PreparedStatement pppst = con.prepareStatement(dSql);
//            pppst.setInt(1, 103);
//            int ssstatus = pppst.executeUpdate();
//            if (ssstatus > 0) {
//                System.out.println("Deleted");
//            } else {
//                System.out.println("Delete fail");
//            }
//            pppst.close();
//            con.close();
            //----------Select Query-----------
//            String qSql = "SELECT * FROM employee3 WHERE emp_id = ?";
//            PreparedStatement qst = con.prepareStatement(qSql);
//            qst.setInt(1, 105);
//            ResultSet rs = qst.executeQuery();
//            
//            rs.next();
//            System.out.println(rs.getInt("emp_id"));
//            System.out.println(rs.getDouble("salary"));
//            System.out.println(rs.getString("f_name"));
//            System.out.println(rs.getString("l_name"));
//            if (rs.next()) {
//                System.out.println(rs.getInt("emp_id"));
//                System.out.println(rs.getDouble("salary"));
//                System.out.println(rs.getString("f_name"));
//                System.out.println(rs.getString("l_name"));
//            } else {
//               System.out.println("No data found");
//            }
//            rs.close();            
//            qst.close();
//            con.close();
            //-------------SELECT QUERY-----------------
            String qSql = "SELECT * FROM employee3";
            PreparedStatement qst = con.prepareStatement(qSql);
            ResultSet rs = qst.executeQuery();
            
            while (rs.next()) {                
                System.out.print(rs.getString("f_name"));
                System.out.print(" ");
                System.out.println(rs.getString("l_name"));
            }

            rs.close();
            qst.close();
            con.close();
            //////
//            String sql = "SELECT * FROM employee3";
//            PreparedStatement ps = con.prepareStatement(sql);
//            //ps.setInt(1, 104);
//            ResultSet rs = ps.executeQuery();
//            //rs.next();
//            //System.out.println(rs.getDouble("salary"));
//            while (rs.next()) {
//                System.out.print(rs.getInt("emp_id"));
//                System.out.print(" ");
//                System.out.print(rs.getString("f_name"));
//                System.out.print(" ");
//                System.out.print(rs.getString("l_name"));
//                System.out.print(" ");
//                System.out.println(rs.getDouble("salary"));
//            }
//            rs.close();
//            ps.close();
//            con.close();

//            String qSql = "SELECT * FROM employee3 WHERE emp_id = ?";
//            PreparedStatement ps = con.prepareStatement(qSql);
//            ps.setInt(1, 104);
//            ResultSet rs = ps.executeQuery();
//            
//            if (rs.next()) {
//                System.out.println(rs.getInt("emp_id"));
//            } else {
//            }
//            rs.close();
//            ps.close();
//            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
