package class_object;

abstract class Shape {
    abstract void CalculateArea();
}
    class ractangle1 extends Shape{
    private int length ;
    private  int width ;
 public ractangle1 (int length ,int width ){
    this.length=length;
    this.width=width ;
 }
        @Override
        void CalculateArea() {
            System.out.println("area of the ractangle ="+ length*width);

        }
    }
    class circle extends Shape{
    private double radius ;
    public circle(double radius){
        this.radius=radius ;
           }

        @Override
        void CalculateArea() {
            System.out.println("area of the circle = "+ radius*radius*3.14);
        }
    }