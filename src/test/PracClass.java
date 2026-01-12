
package test;


public class PracClass {
    public static void main(String[] args) {
        char aa = 'A';
        int bb = aa;
        System.out.println(bb);
        
        int cc = 65;
        char dd = (char)cc;
        System.out.println(dd);
        System.out.println(Character.toChars(97));
        
        System.out.println();
        
        String ss = "Bangladesh";
        char at = 'S';
        
        for (int i = 0; i < ss.length(); i++) {
            at = (char) ss.charAt(i);
            System.out.println(at);
        }
    }
}
