import java.util.Locale;
import java.util.Scanner;

public class URI1052 {

	public static void main(String[] args) {
		int N;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		switch (N) {
		case 1:
			System.out.print("January\n");
			break;
		case 2:
			System.out.print("February\n");
			break;
		case 3:
			System.out.print("March\n");
			break;
		case 4:
			System.out.print("April\n");
			break;
		case 5:
			System.out.print("May\n");
			break;
		case 6:
			System.out.print("June\n");
			break;
		case 7:
			System.out.print("July\n");
			break;
		case 8:
			System.out.print("August\n");
			break;
		case 9:
			System.out.print("September\n");
			break;
		case 10:
			System.out.print("October\n");
			break;
		case 11:
			System.out.print("November\n");
			break;
		case 12:
			System.out.print("December\n");
			break;

		default:
			break;
		}
		scan.close();
	}
}
