public class Calificaciones {
    //Es el final del semestre y obtuviste tus calificaciones de tres clases: Geometría, Álgebra y Física.
    //Crea un programa que lea las calificaciones de estas 3 materias (las calificaciones van del 0 al 10) y crea una funcio que calcule el promedio de las calificaciones
    //Ejemplo: Geometría = 6, Álgebra = 7, Física = 8
    //Salida: puntuación_promedio = 7
    public static void main(String[] args) {
        double geografia=8;
        double algebra=5;
        double fisica=7;

        double promcalificacion=promedio(geografia,algebra,fisica);
        System.out.println("El promdio de las de las calificaciones es " + promcalificacion);
    }
    public static double promedio(double geografia, double algebra, double fisica) {
        double resultado =(geografia + algebra + fisica) / 3;
        return resultado;
    }
}
