
package studentmgt.dao;

import java.sql.Connection;
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
        try {
            //1. Get the connection
            Connection con = DBConnection.getConnection();
            //2. Create Statement
            Statement stmt = con.createStatement();
            //3. execute the statementl
            int status = stmt.executeUpdate(sql);
            
            
            if (status > 0){
                System.out.println("inserted");
                JOptionPane.showMessageDialog(new StudentUI(), "Inserted");
            }
        } catch (Exception e) {
        }
    return s;
    }
}
