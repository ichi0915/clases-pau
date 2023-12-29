public class Concat {
    // Escribe una función que concatene dos listas. [a,b,c], [1,2,3] → [a,b,c,1,2,3]
    public static void main(String[] args) {
        int [] list1={1,2,3,4};
        int [] list2={10,9,8};

        int[] concatenando=concatenarListas(list1,list2);

        for (int num : concatenando){
            System.out.print(num + ",");
        }
    }
    public static int[] concatenarListas(int[] list1, int[] list2) {
        int[] resultado=new int[list1.length + list2.length];
        //no sabía como hacerlo y vi que existe este metodo
        System.arraycopy(list1,0,resultado, 0, list1.length);
        System.arraycopy(list2,0,resultado, list1.length,list2.length);
        return resultado;
    }

}
