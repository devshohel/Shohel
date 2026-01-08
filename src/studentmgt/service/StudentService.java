
package studentmgt.service;

import studentmgt.dao.StudentDAO;
import studentmgt.ui.Student;

public class StudentService {
    public Student save(Student s){
    StudentDAO sdao = new StudentDAO();
    return sdao.insert(s);
    }
}
