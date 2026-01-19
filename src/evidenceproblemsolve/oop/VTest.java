
package evidenceproblemsolve.oop;

public class VTest {
    public static void main(String[] args) {
    VTruck t = new VTruck();
    t.weight = 2500;
    t.regularPrice = 500000.50;
    
        System.out.println(t.getSalePrice());
    }
}
