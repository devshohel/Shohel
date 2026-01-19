
package test;

public class Test {
    public static void main(String[] args) {
       // System.out.println("Hello World");
        
        String name = "Java";
        name.concat(" Programming");
        System.out.println(name);
        System.out.println(name.concat(" Programming"));
        
        String s1 = "Java"; 
        String s2 = "Java";
        String s3 = new String("Java"); 

        System.out.println(s1 == s2); 
        System.out.println(s1 == s3);
        
        char a = '8';
        char b = 'x';

        System.out.println(Character.isDigit(a)); 
        System.out.println(Character.isDigit(b)); 
        
        

    }
}







