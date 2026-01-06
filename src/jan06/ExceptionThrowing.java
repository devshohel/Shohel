
package jan06;

public class ExceptionThrowing {

    public void arrayException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }


    public void arithmeticException() {
        int a = 10;
        int b = 0;
        int c = a / b; 
        System.out.println(c);
    }

    public void nullPointer() {
        String str = null;
        System.out.println(str.length());
    }
}
