
public class Loops {
	public static void main(String[] args) {

		/*
		int i = 0;
		// Boolean condicion = (i < 5);

		while (i < 5) {
			System.out.println(i);
			i++; // i = i+1;
		}
		//*/

		/*int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 5);*/

		// for (int i = 0; i < 5; i++) {
		// 	System.out.println(i);
		// }

		// for (int i = 4; i >= 0; i--) {
		// 	System.out.println(i);
		// }

		// for (int i = 5; 5 > i; i--) {
		// 	System.out.println(i);
		// }

		// for (
		// 	// Solo se corre cuando entra al ciclo
		// 	int i = 0;
		// 	// Se corre primero despues de la asignacion y despues de cada ciclo
		// 	i < 5;
		// 	// Se corre al final de; ciclo
		// 	i++) {
		// 	System.out.println(i);
		// }

		
		// Outer loop
		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer: " + i); // Executes 2 times
			
			// Inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			}
		}*/

		// Continue
		// Este ejemplo omite el valor de 4:
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("asdasd");
			// if (i == 4) {
			if (0 == i%2) {
				continue;
			}
			System.out.println(i);
		}*/

		int i = 0;
		while (i < 10) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			if (i == 8) {
				break;
			}
		}

		// Respuesta: 0, 1, 2, 3, 5, 6, 7

		// i = 1

		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer: " + i); // Executes 2 times
			
			// Inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
			}
		}

		// Imprime los numeros pares del 0 al 10
		for (int i=0; i <= 10; i=i+2) {
			System.out.println(i);
		}

	}
}
