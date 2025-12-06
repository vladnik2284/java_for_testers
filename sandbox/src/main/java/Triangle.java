public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
}