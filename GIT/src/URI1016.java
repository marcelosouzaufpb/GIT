import java.util.Locale;
import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		int z;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		z = scan.nextInt();
		System.out.println(2 * z + " minutos");
		scan.close();

	}

}

