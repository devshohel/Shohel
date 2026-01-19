
package evidenceproblemsolve.oop;
/*01.
 a. Create a super class called Vehicle. The Vehicle class has the following fields and methods.
>int speed;
> double regularPrice;
>String color;
>double getSalePrice();

b. Create a sub class of Vehicle class and name it as Truck. The Truck class has the following fields and methods.
> int weight;
-Now override the double getSalePrice() method from its super class and apply the following logic-
If weight>2000,10% discount. Otherwise no discout on regularPrice.
 */
    
//01
public class Vehicle1 {
    
    int speed;
    double regularPrice;
    String color;
    double getSalePrice(){
        return regularPrice;
    }
 }   
    

//02
class Truck extends Vehicle{
    int weight;
    
    @Override
    double getSalePrice(){
        if(weight > 2000){
        return regularPrice - (regularPrice*10/100);
        }else{
        return regularPrice;
        }
    }
}


//03
class TestVehicle {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.weight = 1900;
        t.regularPrice = 250000.25;
        t.speed = 200;
        t.color = "red";
        
      System.out.println(t.getSalePrice());
    }
}

