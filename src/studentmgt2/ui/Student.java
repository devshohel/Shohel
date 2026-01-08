
package studentmgt2.ui;


public class Student {
    int studentID;
    String name;
    String subject;
    double mark;
    double fees;

    public Student(int studentID, String name, String subject, double mark, double fees) {
        this.studentID = studentID;
        this.name = name;
        this.subject = subject;
        this.mark = mark;
        this.fees = fees;
    }
    
    public Student(){
    
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
 
}
