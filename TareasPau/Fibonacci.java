public class Fibonacci {
    //Write a function that will find the 50th number in the Fibonacci Sequence,
    // and returns the response.
    public static void main(String[] args) {
        System.out.println("El numero 5 de la secuencia de Fibonacci es " + fibonacci() );
        int fibonacciNum=fibonacci();
    }

    public static int fibonacci() {
        int current = 1, previous = 0;

        for (int i=1; i<=5;i++){
            int tmp=current;
            current=current+previous;
            previous=tmp;
        }
    return current;
    }
}
