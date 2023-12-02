package class_object;

interface drivable{
    void drive();
}

public class vehicle implements drivable {
    public String tradeMark   ;
    public String make ;
    public   int year ;
    public boolean run  ;
    public vehicle(String tradeMark , String make , int year ){
        this.tradeMark=tradeMark;
        this.make=make ;
        setYear(year);
        this.run=true;
    }

    public void setYear(int year) {
        if(year<2023) {
            this.year = year;
        }else{
            return;
        }
    }

    public int getYear() {
        return year;
    }

    @Override
    public void drive() {
        System.out.println("nothing ");
    }

    public void start(){
        if(run){
            run=true ;
            System.out.println( "trade mark"+ tradeMark + " make "+make + " start running" );
        }else{
            System.out.println("trade mark "+ tradeMark+" make "+ make +"already run ");
        }
    }
    public void stop(){
        if(run){
            run =false ;
            System.out.println("trade mark "+ tradeMark+" mark "+ make + "stop");
        }else{
            System.out.println("trade mark"+ tradeMark+ "mark"+ make + " dont stop");
        }
    }
    public void sprint(){
        System.out.println(" trade mark"+ tradeMark);
        System.out.println("make "+ make );
        System.out.println("year "+ year);
        start();
        stop();
    }
}
    class NewCar extends vehicle implements drivable{
    private int numberWheel;
        public NewCar(String tradeMark , String make , int year,int numberWheel ){
            super(tradeMark,make,year);
           this.numberWheel=numberWheel;

        }
        @Override
        public void drive() {
            System.out.println("car running ");
        }
    }
    class Bike extends  vehicle implements drivable{
    private  int speed ;
    public  Bike(String tradeMark ,String make ,int year , int speed){
        super(tradeMark,make,year);
        this.speed=speed;

    }
        @Override
        public void drive() {
            System.out.println(" bike running");
        }
    }

