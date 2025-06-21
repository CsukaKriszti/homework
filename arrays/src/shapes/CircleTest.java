package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void shouldCirclePerimeter() {
        Circle circle = new Circle();
        circle.setRadius(10);
        double result = circle.getPerimeter();
        Assertions.assertEquals(62.83, result, 0.01);
    }

    @Test
    void shouldCircleArea() {
        Circle circle = new Circle();
        circle.setRadius(10);
        double result = circle.getArea();
        Assertions.assertEquals(314.16, result, 0.01);
    }
}