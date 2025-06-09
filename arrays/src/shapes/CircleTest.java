package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void shouldCirclePerimeter() {
        Circle circle = new Circle();
        circle.setRadius(10);
        double result = circle.getPerimeter();
        Assertions.assertEquals(62.83185307179586, result);
    }

    @Test
    void shouldCircleArea() {
        Circle circle = new Circle();
        circle.setRadius(10);
        double result = circle.getArea();
        Assertions.assertEquals(314.1592653589793, result);
    }
}