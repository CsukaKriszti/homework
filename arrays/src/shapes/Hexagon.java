package shapes;

public class Hexagon extends Shape {
    private double sideLength;

    public Hexagon() {

    }

    public Hexagon(double side) {
        super();
        this.sideLength = side;
    }

    @Override
    public double getPerimeter() {
        return 6 * sideLength;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Hexagon " + super.toString();
    }
}
