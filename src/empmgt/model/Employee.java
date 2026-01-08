
package empmgt.model;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String desig;
    private String dept;
    private double salary;
    private int age;
    private String addr;
    
    public Employee(int id, String fname, String lname, String desig, String dept, double salary, int age, String addr){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.desig = desig;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }
    
    public Employee(){
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDesig() {
        return desig;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}



