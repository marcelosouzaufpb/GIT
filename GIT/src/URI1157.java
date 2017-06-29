import java.util.Locale;
import java.util.Scanner;

public class URI1157 {

	public static void main(String[] args) {
		int n = 0;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 1; i<= n;i++){
			if(n % i == 0 ){
				System.out.println(i);
			}
		}
		scan.close();
	}
}
