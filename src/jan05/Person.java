
package jan05;

public class Person {
    int id;
    String name;
    double salary;
    
    Person(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    void show(){
        System.out.println(id + " " + name + " " + salary);
    }
}
