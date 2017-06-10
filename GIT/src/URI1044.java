import java.util.Locale;
import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		int a,b;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		if((a%b == 0) || (b%a == 0)){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
		scan.close();
		

	}

}
