import java.util.Locale;
import java.util.Scanner;

public class URI2006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = 0;
		for (int i = 0; i < 5; i++) {
			int z = scan.nextInt();
			if(z == x){
				y++;
			}
		}
		System.out.println(y);
		scan.close();
	}

}
