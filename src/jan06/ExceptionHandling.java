
package jan06;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionThrowing et = new ExceptionThrowing();

        try {
            et.arrayException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception caught");
        }

        try {
            et.arithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }

        try {
            et.nullPointer();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught");
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
