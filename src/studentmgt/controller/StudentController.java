
package studentmgt.controller;

import studentmgt.service.StudentService;
import studentmgt.ui.Student;

public class StudentController {
    public Student create(Student s){
    StudentService ss = new StudentService();
    Student stu = ss.save(s);
    return stu;
    }
}
