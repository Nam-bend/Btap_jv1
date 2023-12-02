package class_object;

public class main {
    static void driveVehicle(vehicle ver){
         ver.drive();
    }
    public static void main(String[] args) {
        //1,2
        car c = new car( "bandai","Susuki",2023);
     c.InfCar();
     c.startEngine();
     c.endEngnie();
     //3.4
        rectangle rec = new rectangle();
        rectangle rec1 = new rectangle(5 ,6);
        rec1.printInfRectangle();
        rec1.acreage();
        rec.setLength(10);
        rec.setWidth(5);
        int d = rec.getLength();
        int r =rec.getWidth() ;
        System.out.println("length ="+d + "  width ="+ r);
        System.out.println("S = "+ d*r);
     //5,6

      Bike bicycle =new Bike("toyota","fixgear", 2030, 25);
      NewCar mycar = new NewCar("suzuki ", "fantom ", 2022,4);
        bicycle.sprint();mycar.sprint();
      //7.
      circle Cir = new circle(3.2);
      ractangle1 Rac = new ractangle1(5,3);
      Cir.CalculateArea();
      Rac.CalculateArea();
       // 8.
        mycar.drive();
        bicycle.drive();
        //9. tinhs
       driveVehicle(mycar);
       driveVehicle(bicycle);



    }
}

