
package studentmgt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import studentmgt.ui.Student;
import studentmgt.ui.StudentUI;
import studentmgt.util.DBConnection;

public class StudentDAO {
    public Student insert(Student s){
        String id = String.valueOf(s.getStudentID());
        String name = s.getStudentName();
        String sub = s.getSubject();
        String mark = String.valueOf(s.getMark());
        String fees = String.valueOf(s.getFees());
        String sql = "INSERT INTO STUDENT (student_id, student_name, subject, mark, fees) VALUES ('"+id+"', '"+name+"','"+sub+"', '"+mark+"', '"+fees+"')";
        //String sql = "INSERT INTO STUDENT(student_id, student_name, subject, mark, fees) VALUES(?,?,?,?,?)";
        try {
            //1. Get the connection
            Connection con = DBConnection.getConnection();
            //2. Create Statement
            Statement stmt = con.createStatement();
            //3. execute the statementl
            int status = stmt.executeUpdate(sql);
            
//            Connection con = DBConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, id);
//            ps.setString(2, name);
//            ps.setString(3, sub);
//            ps.setString(4, mark);
//            ps.setString(5, fees);
//            int status = ps.executeUpdate();
            
            
            if (status > 0){
                System.out.println("inserted");
                JOptionPane.showMessageDialog(new StudentUI(), "Inserted");
            }
            
            //ps.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
        }
    return s;
    }
}
