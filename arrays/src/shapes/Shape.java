package shapes;

public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();

    public String toString() {
        return "perimeter and area: " + getPerimeter() + " , " + getArea();
    }
}
