package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HexagonTest {
    @Test
    void shouldPerimeter() {
        Hexagon hexagon = new Hexagon();
        hexagon.setSideLength(3);
        double result = hexagon.getPerimeter();
        Assertions.assertEquals(18.0, result, 0.01);
    }

    @Test
    void shouldArea() {
        Hexagon hexagon = new Hexagon();
        hexagon.setSideLength(3);
        double result = hexagon.getArea();
        Assertions.assertEquals(23.38, result, 0.01);
    }
}