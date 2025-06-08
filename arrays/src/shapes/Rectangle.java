package shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }
}
