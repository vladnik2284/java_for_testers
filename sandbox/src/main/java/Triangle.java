public class Triangle {

    static void printPerimeterTriangle(double a, double b, double c) {
        var text = String.format("Периметр тругольника со сторонами %.1f, %.1f и %.1f = %.1f", a, b, c, perimeterTriangle(a, b, c));
        System.out.println(text);
    }

    private static double perimeterTriangle(double a, double b, double c) {
        return a + b + c;
    }

    static void printAreaTriangle(double a, double b, double c) {
                System.out.println("Площадь тругольника со сторонами " + a + " , " + b + " , " + c + " = " + areaTriangle( a,  b, c));
    }

    private static double areaTriangle(double a, double b, double c) {
        double p = perimeterTriangle(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}