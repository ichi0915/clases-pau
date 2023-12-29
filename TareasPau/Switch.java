import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe los dos numeros que quieres sumar:");
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());

            System.out.println("Escribe el numero de la operacion que quieras realizar:");
            System.out.println("1. Suma\n");
            System.out.println("2. Resta\n");
            System.out.println("3 Multiplicacion\n");
            System.out.println("4. Division\n");

            int opcion= Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    realizarSuma(num1,num2);
                    break;
                case 2:
                    realizarResta(num1,num2);
                    break;
                case 3:
                    realizarMultiplicacion(num1,num2);
                    break;
                case 4:
                    realizarDivision(num1,num2);
                    break;
                default:
                    System.out.println("Opcion incorrecta [1,2,3,4]");
            }
        }

        public static void realizarSuma(int num1, int num2){
            int suma= num1 + num2;
            System.out.println("la suma de " + num1 + " y " + num2 +" es "+ suma);
        }
        public static void realizarResta(int num1, int num2){
            int resta= num1 - num2;
            System.out.println("la resta de " + num1 + " y " + num2 +" es "+ resta);
        }
        public static void realizarMultiplicacion(int num1, int num2){
            int multiplicacion= num1*num2;
            System.out.println("la multiplicacion de " + num1 + " y " + num2 +" es "+ multiplicacion);
        }
        public static void realizarDivision(int num1, int num2){
            int division= num1/num2;
            System.out.println("la suma de " + num1 + " y " + num2 +" es "+ division);
        }
}
