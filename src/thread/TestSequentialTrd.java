
package thread;

public class TestSequentialTrd {
    void x(){
        System.out.println("X");
    }
    void y(){
        System.out.println("Y");
    }
    
    public static void main(String[] args) {
        TestSequentialTrd td = new TestSequentialTrd();
        for (int i = 0; i < 5; i++) {
            td.x();
        }
        for (int i = 0; i < 5; i++) {
            td.y();
        }
        
        A a = new A();
        a.x();
        B b = new B();
        b.y();
    }
}

class A{
    void x (){
        System.out.println("X");
    }
}
class B{
    void y(){
        System.out.println("Y");
    }
}