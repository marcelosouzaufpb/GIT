import java.util.Locale;
import java.util.Scanner;

public class URI1960 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(numeroRomano(n));
		scan.close();
	}

	public static String numeroRomano(int n) {
		StringBuilder sb = new StringBuilder();
		String[] numerosRomano = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		int t = 0, i, sz = ints.length - 1;

		for (i = sz; i >= 0; i--) {
			t = n / ints[i];
			n %= ints[i];
			while (t > 0) {
				sb.append(numerosRomano[i]);
				t--;
			}
		}

		return sb.toString();
	}
}
