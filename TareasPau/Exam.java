import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
    //Realiza una calculadora usando los argumentos de la funcion main, como va a funcionar es que el
    // programa va a leer el primer parametro de entrada para comparar si es igual a sum, minus, mult, div.
    // en el caso de no recibir alguno de esos strings mandar mensaje de error, despues usa los siguientes
    // 2 argumentos para realizar la operacion, las operaciones tienen que ser realizadas dentro de
    // diversas funciones la cuales regrese como respuesta el valor de la operacion.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe los dos numeros que quieres sumar:");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("Escribe la operacion que quieras realizar: sum, minus, mult o div");
        String opcion= br.readLine();

        int res=0;

        switch(opcion){
            case "sum":
                res=realizarSuma(num1,num2);
                break;
            case "minus":
                res=realizarResta(num1,num2);
                break;
            case "mult":
                res=realizarMultiplicacion(num1,num2);
                break;
            case "div":
                res=realizarDivision(num1,num2);;
                break;
            default:
                System.out.print("Operacion no reconocida");
                return;
        }
            System.out.println("El resultado de la operacion es " + res);
    }
    public static int realizarSuma(int num1,int num2) {
        int suma= num1 + num2;
        return suma;
    }
    public static int realizarResta(int num1, int num2){
        int resta= num1 - num2;
        return resta;
    }
    public static int realizarMultiplicacion(int num1, int num2){
        int multiplicacion= num1*num2;
        return multiplicacion;

    }
    public static int realizarDivision(int num1, int num2){
        int division= num1/num2;
        return division;
    }
}
