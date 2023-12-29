public class FindNum {
    //Escriba una función que verifique si un elemento aparece en una lista.
    public static void main(String[] args) {
        int[] lista={86,13,6,45,232,2};
        int buscarNum=2;
        boolean find= findIfContains(lista,buscarNum);
        System.out.println(find);

    }

    public static boolean findIfContains(int[] lista,int buscarNum){
        boolean find= false;

        for (int i=0;i<lista.length;i++){
            if (lista[i]==buscarNum) {
                find=true;
                break;
            }
        }
        return find;
    }
}
