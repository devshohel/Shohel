
package practice.relationship.hasa;


public class SStudent {
    int studentID;
    String studentName;
    SSchool scl;

    public SStudent(int studentID, String studentName, SSchool scl) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.scl = scl;
    }
    
    void show(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("School EIIN: "+scl.EIIN);
        System.out.println("School Name: "+scl.SclName);
    }
    
}
