import java.util.Locale;
import java.util.Scanner;

public class URI1172 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
    	Scanner scan = new Scanner(System.in);
    	int x[] = new int[10];

    	for (int i=0; i < 10; i++) {
    		x[i] = scan.nextInt();
    		if (x[i] <= 0) {
    			x[i] = 1;
    		}
    		System.out.println("X[" + i + "] = " + x[i]);
    	}
    	scan.close();
    }
}
