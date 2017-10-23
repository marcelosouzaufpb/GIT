import java.util.Locale;
import java.util.Scanner;

public class URI1930 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		byte t1 = scan.nextByte();
		byte t2 = scan.nextByte();
		byte t3 = scan.nextByte();
		byte t4 = scan.nextByte();
		System.out.println(t1 + t2 + t3 + t4 - 3);
		scan.close();
	}
}
