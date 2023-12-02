package class_object;

public class car {
    private     String brand;
      private   String model;
      private   int year;
      private boolean engine_Start=true ;
        public car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.engine_Start=engine_Start ;

        }

        public void InfCar() {
            System.out.println("brand: " + brand);
            System.out.println("model: " + model);
            System.out.println("year: " + year);
            System.out.println("engnieStart "+ (engine_Start?"rungning":"stopping"));
        }
            public void startEngine () {
                if (engine_Start == true) {
                    System.out.println("start run");

                } else
                    System.out.println(" dont run ");
            }
            public void endEngnie(){
            if(engine_Start){
                System.out.println("stopping");
                engine_Start= false;
            }else
                System.out.println("already stop");
            }
        }

