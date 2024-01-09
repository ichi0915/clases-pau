import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adivinanzas {
    //Escribe un juego de adivinanzas en el que el usuario tenga que adivinar un número secreto.
    // Después de cada suposición, el programa le dice al usuario si su número era demasiado grande
    // o demasiado pequeño. Al final se debe imprimir el número de intentos necesarios. Solo cuenta
    // como un intento si ingresan el mismo número varias veces consecutivas.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Elige un numero del 1 al 10 :");
        int intentos= 0;
        int random=(int)(Math.random()*10+1);
        //System.out.println(random);

        while (true){
            int guessNumber = Integer.parseInt(br.readLine());
            intentos++;

            if (guessNumber>random){
                System.out.println("Tu numero es muy grande, intenta de nuevo");
            } else if (guessNumber<random) {
                System.out.println("Tu numero es muy pequeño, intenta de nuevo");
            }else {
                System.out.println("Felicidades, adivinaste el numero");
                System.out.println("Intentaste " + intentos + " veces");
                break;
            }
        }
    }
}
