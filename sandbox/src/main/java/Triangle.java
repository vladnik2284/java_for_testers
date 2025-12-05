public class Triangle {

   public static void main(String[] agrs) {
       printPerimeterTriangle(7.0, 7.0, 9.0);
       printAreaTriangle(3.0, 4.0, 5.0);
   }


    static void printPerimeterTriangle(double a, double b, double c) {
        System.out.println("Периметр тругольника со сторонами " + a + " , " + b + " , " + c + " = "  + perimeterTriangle(a, b, c));
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