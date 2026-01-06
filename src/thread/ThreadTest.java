
package thread;

public class ThreadTest {
    //By Thread Class
    //By Runnable Interface
    public static void main(String[] args) {
        ThreadByClass tByC = new ThreadByClass();
        tByC.start();
        ThreadByInterface tByI = new ThreadByInterface();
        tByI.run();
    }
}

class ThreadByClass extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Class");
        }
    }
 }   
class ThreadByInterface extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface");
        }
    }
}
