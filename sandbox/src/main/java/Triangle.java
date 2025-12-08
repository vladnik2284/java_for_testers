import java.util.Objects;

public record Triangle(
        double a,
        double b,
        double c
) {
    public Triangle {
        if (a < 0 || b < 0 || c < 0 ) {
            throw new IllegalArgumentException("Triangle a or b or c should be non-negativt");
        }
        if ((a + b) <= c || (a + c) <= b || (b +c) <= a) {
            throw new IllegalArgumentException("The sum of two sides of a triangle cannot be less than or equal to the third side");
        }
    }

    static void printPerimeterTriangle(Triangle per) {
        var text = String.format("Периметр тругольника со сторонами %.1f, %.1f и %.1f = %.1f", per.a, per.b, per.c, per.perimeterTriangle());
        System.out.println(text);
    }

    public static void printAreaTriangle(Triangle ar) {
        System.out.println("Площадь тругольника со сторонами " + ar.a + " , " + ar.b + " , " + ar.c + " = " + ar.areaTriangle());
    }

    public double areaTriangle() {
        double p = perimeterTriangle() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double perimeterTriangle() {
        return this.a + this.b + this.c;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.c) == 0)
                || (Double.compare(a, triangle.b) == 0 && Double.compare(b, triangle.a) == 0 && Double.compare(c, triangle.c) == 0)
                || (Double.compare(a, triangle.c) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.a) == 0)
                || (Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.c) == 0 && Double.compare(c, triangle.b) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}