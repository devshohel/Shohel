
package studentmgt3.service;

import studentmgt3.dao.StudentDAO;
import studentmgt3.ui.Student;


public class StudentService {
    public Student save(Student s){
    StudentDAO sdao = new StudentDAO();
        return sdao.insert(s);
    }
}
