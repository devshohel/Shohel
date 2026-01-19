
package evidenceproblemsolve.oop;


public class VTruck extends Vehicle{
    int weight;
    
    @Override
   double getSalePrice(){
    if(weight > 2000){
    return regularPrice - (regularPrice *10/100);
    }else{
    return regularPrice;
    }
    }
}
