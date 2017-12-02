import java.util.Locale;
import java.util.Scanner;

public class URI1984 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		sb.reverse();
		System.out.println(sb);
		scan.close();

	}

}
