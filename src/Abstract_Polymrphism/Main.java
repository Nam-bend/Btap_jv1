package Abstract_Polymrphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  1.
        Rectangle rec = new Rectangle(3, 4);
        Circle cir = new Circle(3);
        rec.area();
        cir.area();
        // 2.
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        //3.
        List<Vehicle> veh = new ArrayList<>();
        veh.add(new Car());
        veh.add(new Bicycle());
        for (Vehicle vehicle : veh) {
            vehicle.speedUp();
            vehicle.apllyBrakes();
        //4.
           CreditCardProcessor creditCardProcessor =new CreditCardProcessor();
           PaypalProcessor paypalProcessor=new PaypalProcessor();
           PaymentService paymentService1 = new PaymentService(creditCardProcessor);
           paymentService1.process();
           PaymentService paymentService2 = new PaymentService(paypalProcessor);
           paymentService2.process();

        }
    }
}
