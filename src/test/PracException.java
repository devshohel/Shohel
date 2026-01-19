
package test;


public class PracException {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int result = 0;
        
        try {
            result = x/y;
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Finally");
        }
    }
}
