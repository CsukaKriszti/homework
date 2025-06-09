package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(3, 6);
        Shape triangle = new Triangle(2, 4, 6);
        Shape hexagon = new Hexagon(6);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(hexagon);
    }

}