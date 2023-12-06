package Abstract_Polymrphism;

abstract class Vehicle {
    abstract void speedUp();

    void apllyBrakes() {
        System.out.println(" apply brakes ");
    }
}
class Car extends Vehicle{
    @Override
    void speedUp() {
        System.out.println("speed up car ");
    }

    @Override
    void apllyBrakes() {
        System.out.println("applying brakes my car ");
    }
}
 class Bicycle extends Vehicle{
     @Override
     void speedUp() {
         System.out.println("bicycle increases speed ");
     }

     @Override
     void apllyBrakes() {
         System.out.println("aplly brakes the bicycle ");;
     }
 }
