public class PrimeNum {
    //Write a function that tests if a number, is a prime number, and returns a boolean.
    public static void main(String[] args) {
        boolean primo = esPrimo(5);
        System.out.println(primo);
    }

    public static boolean esPrimo(int num) {
        boolean ifPrimo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ifPrimo = false;
                break;
            }
        }
        return ifPrimo;
    }
}
