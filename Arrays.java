public class Arrays {
	public static void main(String[] args) {

		/*
		// String[5] carros;
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "asd";

		// System.out.println(cars[1]); // 20

		// System.out.println(cars[0]); // asd
		cars[0] = "4444";
		// System.out.println(cars[0]); // 4444

		// int[] numeros = {10, 20, 30, 40};
		// numeros[0] = 6;

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		//*/


		/*
		int numeros[] = { 10, 50, 60, 80, 90 };

		// Usando foreach
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		// usando for - este for es igual al de arriba
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		*/

		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// System.out.println(myNumbers[1][2]); // Outputs 7
		// myNumbers ahora es un arreglo con dos areglos como elementos.

		// ==================
		// Loop Through a Multi-Dimensional Array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0; i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}

	}
}
