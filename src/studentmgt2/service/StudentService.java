
package studentmgt2.service;

import studentmgt2.dao.StudentDAO;
import studentmgt2.ui.Student;


public class StudentService {
    public Student save(Student s){
    StudentDAO sdao = new StudentDAO();
        return sdao.insert(s);
    }
}

