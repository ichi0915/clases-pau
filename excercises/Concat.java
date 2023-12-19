package excercises;
public class Concat {
	
	public static void main(String[] args) {
		String[] lista1 = { "10", "50", "60", "80", "90" };
		String[] lista2 = { "a", "b", "c" };

		String[] listaResultado = concatLists(lista1, lista2);

		System.out.println("=== Imprimiendo listaResultado ===");
		printArray(listaResultado);
	}

	// Escribe una función que concatene dos listas. [a,b,c], [1,2,3] → [a,b,c,1,2,3]
	public static String[] concatLists(String[] lista1, String[] lista2) {
		String[] response = new String[lista1.length + lista2.length];
		int currentPos = 0;

		// Ciclo para recorrer la lista1
		for (int i = 0; i < lista1.length; i++) {
			response[currentPos] = lista1[i];
			currentPos++;
		}

		// System.out.println(currentPos); // 5
		// System.out.println("=== Imprimiendo Response ==="); // 5
		// printArray(response); // { "10", "50", "60", "80", "90", null, null, null }

		// Ciclo para recorrer la lista2
		for (int i = 0; i < lista2.length; i++) {
			response[currentPos] = lista2[i];
			currentPos++;
		}

		return response;
	}

	public static void printArray(String[] arr) {
		if (null != arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
