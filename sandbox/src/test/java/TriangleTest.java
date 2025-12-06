import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculateArea () {
        var s = new Triangle(3, 4, 5);
        Assertions.assertEquals(6, s.areaTriangle());
    }

    @Test
    void canCalculatePerimetr () {
        var per = new Triangle(7, 7, 9);
        Assertions.assertEquals(23, per.perimeterTriangle()) ;
    }
}
