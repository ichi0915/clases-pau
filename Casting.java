import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Casting {
		public static void main(String[] args) {

			//Ampliación
			// byte -> short -> char -> int -> long -> flotante -> doble

			/*short shortNum = getInt();			// 2 bytes en mem
			System.out.println("shortNum es: " + shortNum);
			// short shortNum = 32767;			// 2 bytes en mem
			int intNum = shortNum;			// 4 bytes en mem
			long longNum = intNum;			// 8 bytes en mem

			// 0000 0000 0000 1000
			// 0000 0000 0000 0000 0000 0000 0000 1000
			// 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1000

			System.out.println("longNum es: " + longNum);*/

			//Narrowing Casting
			//doble -> flotante -> largo -> int -> char -> corto -> byte

			// 32767
			// 123123.0

			// long longNum = 8888888880x;			// 8 bytes en mem
			long longNum = 8888888888L;			// 8 bytes en mem
			System.out.println("longNum es: " + longNum);

			int intNum = (int)longNum;			// 4 bytes en mem
			System.out.println("intNum es: " + intNum);

			short shortNum = (short)intNum;			// 2 bytes en mem
			System.out.println("shortNum es: " + shortNum);

			char aaa = '2';
			String bbb = aaa;

		}

		public static short getInt() {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int value = 0;

			try {
				value = Integer.parseInt(br.readLine());
			}
			catch(Exception exception) {
				System.err.println("Invalid Format!");
			}

			return (short)value;
		}
	}
