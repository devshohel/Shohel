
package jan06;

public class Employee implements Emp{

    int id;
    String name;
    double salary;
    int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println(id + " " + name + " " + salary + " " + age);
    }
}
