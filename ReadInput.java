import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
	int edad = 0;

	public static void main(String[] args) throws IOException {
		// int age = 0;

		// // Leemos un string
		// System.out.print("Como te llamas:");
		// String name = br.readLine();

		// System.out.print("Donde vives:");
		// String city = br.readLine();

		// Leemos un entero
		System.out.print("cuantos anos tienes:");
		int age = getInt();

		if (age < 18) {
			System.out.print("menor de edad");
		}
		else {
			System.out.print("mayor de edad");
		}

		// System.out.print("en que ano naciste:");
		// int year = getInt();

		// Escribimos respuesta en consola
		// System.out.println("Hola " + name + " tienes " + age + " anos, mucho gusto ano nacimiento: " + year);

		// Array
		int[] numeros = new int[5];
		numeros[0] = 1;
		numeros[2] = 88;
		numeros[3] = 11;
		numeros[4] = 199;

		// System.out.println("numero pos 4: " + numeros[4]);

		int numerooo = 0;
		numerooo = numerooo + 1;	// 1
		numerooo++; 				// 2
		numerooo++; 				// 3
		numerooo++; 				// 4
		numerooo = numerooo + 1;	// 5

		System.out.println("numerooo: " + numerooo);

		// for (int numero : numeros) {
		for (int i = 0; i < 5; i++) {
			// System.out.println("numero: " + numeros[i]);
			System.out.println("numero");
		}

	}

	// Scope -- lo que regresa -- nombre de la funcion  
	public static int getInt() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;

		try {
			value = Integer.parseInt(br.readLine());
		}
		catch(Exception exception) {
			System.err.println("Invalid Format!");
		}

		return value;
	}

	public static String getStr() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = "";
		value = br.readLine();
		return value;
	}

	// public static String getStr() throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	String value = br.readLine();
	// 	return value;
	// }

	// public static String getStr() throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	return br.readLine();
	// }

}
