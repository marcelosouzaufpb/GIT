import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		double Y = scan.nextDouble();
		DecimalFormat df = new DecimalFormat("##.000");
		System.out.println(df.format(X / Y) + " km/l");
		scan.close();
	}
}
