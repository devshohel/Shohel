
package studentmgt.ui;


public class Student {
    int studentID;
    String studentName;
    String subject;
    double mark;
    double fees;

    public Student(int studentID, String studentName, String subject, double mark, double fees) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.subject = subject;
        this.mark = mark;
        this.fees = fees;
    }
    
    public Student(){
    
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public double getMark() {
        return mark;
    }

    public double getFees() {
        return fees;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID = " + studentID + ", studentName = " + studentName + ", subject = " + subject + ", mark = " + mark + ", fees = " + fees + '}';
    }

    public void setName(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
