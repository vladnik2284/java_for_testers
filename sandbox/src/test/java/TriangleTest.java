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

    @Test
    void comparisonTriangleBAC() {
        var t1 = new Triangle(3, 4, 5);
        var t2 = new Triangle(4, 3, 5);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void comparisonTriangleACB() {
        var t1 = new Triangle(3, 4, 5);
        var t2 = new Triangle(3, 5, 4);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void comparisonTriangleCBA() {
        var t1 = new Triangle(3, 4, 5);
        var t2 = new Triangle(5, 4, 3);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void comparisonTriangleABC() {
        var t1 = new Triangle(2, 3, 4);
        var t2 = new Triangle(2, 3, 4);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void comparisonTriangleBCA() {
        var t1 = new Triangle(2, 3, 4);
        var t2 = new Triangle(3, 4, 2);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void comparisonTriangleCAB() {
        var t1 = new Triangle(2, 3, 4);
        var t2 = new Triangle(4, 2, 3);
        Assertions.assertEquals(t1, t2);
    }

}

