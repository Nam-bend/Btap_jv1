package Abstract_Polymrphism;

public class Rectangle extends Shape {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.width = width;
        this.length = length;

    }

    @Override
    void area() {
        System.out.println("area = " + length * width);
    }
}
