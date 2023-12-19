public class Function {

	int globalLogLevel = 0;
	// Niveles 0 debug
	// Niveles 1 info
	// Niveles 2 warning

	public static void main(String[] args) {

		log(0, "Inicio la funcion main");

		// for (String arg : args) {
		// 	if (arg.contains("suma"))
		// 		System.err.println("arg:" + arg);
		// 	else
		// 		System.err.println("argumetno invalido");
		// }
		int num = 0;

		float resultado = suma(3,5);
		log(1, "Realizo operacion");

		log(2, "resultado:" + resultado);
	}

	public static float suma(float x, float y) {
		return x +y;
	}

	public static int suma(int x) {
		return x;
	}

	public static int suma(int x, int y) {
		return x +y;
	}

	// private static float sumaFlotantes(int x, int y) {
	// 	return x +y;
	// }

	// Niveles 0 debug
	// Niveles 1 info
	// Niveles 2 warning
	public static void log(int logLevel, String message) {
		if (0 == logLevel) {
			System.out.println("Log: " + message);
		}
		else if (1 == logLevel) {
			System.out.println("Log: " + message);
		}
		else if (2 == logLevel) {
			System.out.println("Log: " + message);
		}
	}

}

// public class Calculadora {
// 	public static int suma(int x, int y) {
// 		return x +y;
// 	}
// }

