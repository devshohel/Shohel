
package practice.relationship.hasa;


public class STest {
    public static void main(String[] args) {
        SSchool sl = new SSchool(1212, "F.M School");
        SStudent st1 = new SStudent(101,"Saiful Islam", sl);
        st1.show();
        
        SStudent st2 = new SStudent(102,"Jakir", sl);
        st2.show();
    }
}
