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

    @Test
    void cannotCreateTriangleWithNegativeSideA() {
        try {
            new Triangle(-7, 7, 9);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriahgleWithNegativeSideB() {
        try {
            new Triangle(7, -7, 9);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriahgleWithNegativeSideC() {
        try {
            new Triangle(7, 7, -9);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriahgleWithSumSideA() {
        try {
            new Triangle(7, 1, 1);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriahgleWithSumSideB() {
        try {
            new Triangle(1, 7, 1);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriahgleWithSumSideC() {
        try {
            new Triangle(7, 1, 8);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }
}
