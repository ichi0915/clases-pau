public class Palindromo {
	public static void main(String[] args) {
		// String str = "anitalavalatina";
		String str = "hola";

		String strEnReversa = invertirString(str);
		System.out.println("String en reversa: " + strEnReversa);

		Boolean esPalindromo = checkIfEqual(str, strEnReversa);
		printPalindromo(esPalindromo);

		esPalindromo = checkIfPalindromoFunction(str);
		printPalindromo(esPalindromo);

		esPalindromo = checkIfPalindromoLoop(str);
		printPalindromo(esPalindromo);
	}

	public static String invertirString(String str) {
		String response = "";

		for (int i=str.length()-1; i >= 0; i--) {
			response += String.valueOf(str.charAt(i));
		}

		return response;
	}

	public static Boolean checkIfEqual(String str1, String str2) {
		Boolean response = false;

		if (str1.equals(str2)) {
			response = true;
		}

		return response;
	}

	public static Boolean checkIfPalindromoFunction(String str) {
		Boolean response = false;

		String strInvertido = invertirString(str);

		response = checkIfEqual(strInvertido, str);

		return response;
	}

	// Version one line
	// public static Boolean checkIfPalindromo1(String str) {
	// 	return checkIfEqual(invertirString(str), str);
	// }

	public static Boolean checkIfPalindromoLoop(String str) {
		Boolean response = true;
		int derecha = str.length()-1;

		for (int izquierda=0; izquierda < str.length(); izquierda++) {
			// System.out.print(str.charAt(izquierda) + "-");
			// System.out.print(str.charAt(derecha) + "\n");

			if (str.charAt(izquierda) != str.charAt(derecha)) {
				response = false;
				break;
			}
			derecha--;
		}

		return response;
	}

	public static void printPalindromo(Boolean esPalindromo) {
		if (esPalindromo) {
			System.out.println("el String es palindromo");
		}
		else {
			System.out.println("el String No es palindromo");
		}
	}

}
