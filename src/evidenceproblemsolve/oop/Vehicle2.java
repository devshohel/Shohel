
package evidenceproblemsolve.oop;
/*
Q: (Inheritance with method Overriding)
create a class Vehicle and create a method name vehicleRun . 
create another class name Car and inherit the vehicle class.
Override the vehicleRun  method in the Car class and print the both methods.
*/

//01
public class Vehicle2 {
    
    void vehicleRun(){
        System.out.println("The vehicle in running");
    }
}

//02
class Car extends Vehicle2{

    @Override
    void vehicleRun(){
        System.out.println("The car is running");
    }
}

//03
class TestVnC{
    public static void main(String[] args) {
        Vehicle2 v = new Vehicle2();
        v.vehicleRun();
        
        Car c = new Car();
        c.vehicleRun();
    }
}


