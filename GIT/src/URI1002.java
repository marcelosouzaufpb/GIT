import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		double area = 3.14159 * (raio * raio);
		DecimalFormat df = new DecimalFormat("####.0000");
		System.out.println("A=" + df.format(area));
	}

}