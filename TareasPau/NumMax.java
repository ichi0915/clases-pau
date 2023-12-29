public class NumMax {
   //Escribe una función que devuelva el elemento más grande de una lista.
    public static void main(String[] args) {
        int[] lista={86,13,6,45,232,2};
        int numMax= findMax(lista);
        System.out.println("El numero maximo es " + numMax);
    }

    public static int findMax(int[] lista){
        int max=0;

        for (int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
            if (max < lista[i]) {
                max=lista[i];
            }
        }
        return max;
    }
}

