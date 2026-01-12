
package practice.relationship.hasa;


public class Test {
    public static void main(String[] args) {
        Department d1 = new Department(121, "IT");
        
        Employee e1 = new Employee(10, "Hassan", d1);
        
        e1.display();
    }
}
