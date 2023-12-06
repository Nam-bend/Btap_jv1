package Abstract_Polymrphism;

public class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("area =" + (radius * radius * 3.14));
    }
}
