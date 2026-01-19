
package evidenceproblemsolve.oop;
/*
Q: (inheritance)
Crteate a class with a method that prints "This is parent class" 
and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
 */

//01
public class Parent {
    void showParent(){
        System.out.println("This is parent class.");
    }
} 

//02
class Child extends Parent{
    void showChild(){
        System.out.println("This is chils class.");
    }
}

//03
class Test{
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        
        //Parent pc = new Child();
        
        p.showParent();
        c.showChild();
        c.showParent();
        
        //pc.showParent();
    }
}
