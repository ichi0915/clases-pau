public class AreaFiguras {
    public static void main(String[] args) {

        double baseTriangulo=5;
        double alturaTriangulo=8;
        double radioCirculo=3;
        double baseRectangulo=6;
        double alturaRectangulo=4;

        System.out.println("El area del triangulo es : "+ areaTriangulo(baseTriangulo,alturaTriangulo));
        System.out.println("El area del Circulo es : "+ areaCirculo(radioCirculo));
        System.out.println("El area del Rectangulo es : "+ areaRectangulo(baseRectangulo,alturaRectangulo));
    }

    public static double areaTriangulo(double base, double altura) {
        return (base*altura)/2;
    }
    public static double areaCirculo(double radio) {
        return (Math.PI*radio*radio);
    }
    public static double areaRectangulo(double base, double altura) {
        return (base*altura);
    }
}

