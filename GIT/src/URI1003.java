import java.io.IOException;
import java.util.Scanner;

public class URI1003 {

	public static void main(String[] args) throws IOException {
		int A, B;
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		int SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
		scan.close();

	}

}
