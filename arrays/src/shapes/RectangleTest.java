package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldPerimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        double result = rectangle.getPerimeter();
        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        double result = rectangle.getArea();
        Assertions.assertEquals(6, result);
    }
}