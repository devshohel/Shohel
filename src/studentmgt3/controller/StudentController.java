
package studentmgt3.controller;

import studentmgt3.service.StudentService;
import studentmgt3.ui.Student;

public class StudentController {
    public Student create(Student s){
    StudentService ss = new StudentService();
    Student stu = ss.save(s);
    return stu;
    }
}
