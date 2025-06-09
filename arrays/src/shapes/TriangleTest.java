package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void shouldPerimeter() {
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        double result = triangle.getPerimeter();
        Assertions.assertEquals(12, result);
    }

    @Test
    void shouldArea() {
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        double result = triangle.getArea();
        Assertions.assertEquals(6, result);
    }
}