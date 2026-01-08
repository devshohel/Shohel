
package studentmgt2.controller;

import studentmgt2.service.StudentService;
import studentmgt2.ui.Student;


public class StudentController {
    public Student create(Student s){
    StudentService ss = new StudentService();
    Student stu = ss.save(s);
        return stu;
    }
}

