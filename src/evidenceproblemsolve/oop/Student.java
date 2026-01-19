
package evidenceproblemsolve.oop;
/*
Q:2. (Encapsolution)
1) Make the instance variables private so that they cannot be accessed directly from outside the class. 
You can only set and get values of these variables through the methods of the class,
2) Have getter and setter methods in the class to set and get the values of the fields.
*/

//01
public class Student {
    
    private int id ;
    private String name;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}


//02
class StuTest {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.setId(1293330);
        s.setName("Shohel");
        
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
