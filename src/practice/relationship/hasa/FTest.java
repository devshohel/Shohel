
package practice.relationship.hasa;


public class FTest {
    public static void main(String[] args) {
        FDepartment d1 = new FDepartment(121, "IT");
        
        FEmployee e1 = new FEmployee(10, "Hassan", d1);
        
        e1.display();
    }
}
