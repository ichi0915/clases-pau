public class Intercambio {
    //Crea dos variables a y b, asignales un valor inicial para cada una con un número diferente. Escriba una funcion que intercambie ambos valores.
    //Ejemplo: a = 10, b = 20
    //Salida: a = 20, b = 10
    static int a = 5, b = 4;

    public static void main(String[] args) {

        System.out.println("Antes del intercambio a: " + a + ",b: " + b);
        exchangeNums();
        System.out.println("Después del intercambio a: " + a + ",b: " + b);
    }
    public static void exchangeNums(){
        int temp =a;
        a=b;
        b=temp;
    }
}
