import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1179 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x, c1 = 0, c2 = 0;
		int[] par = new int[5];
		int[] imp = new int[5];
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for (int j = 0; j < 14; j++) {
			x = Integer.parseInt(in.readLine());
			if (x % 2 == 0) {
				par[c1] = x;

				c1++;
			} else {
				imp[c2] = x;
				c2++;
			}
			if (c1 == 5) {
				System.out.println("par[" + 0 + "] = " + par[0]);
				System.out.println("par[" + 1 + "] = " + par[1]);
				System.out.println("par[" + 2 + "] = " + par[2]);
				System.out.println("par[" + 3 + "] = " + par[3]);
				System.out.println("par[" + 4 + "] = " + par[4]);
				c1 = 0;
			}
			if (c2 == 5) {
				System.out.println("impar[" + 0 + "] = " + imp[0]);
				System.out.println("impar[" + 1 + "] = " + imp[1]);
				System.out.println("impar[" + 2 + "] = " + imp[2]);
				System.out.println("impar[" + 3 + "] = " + imp[3]);
				System.out.println("impar[" + 4 + "] = " + imp[4]);
				c2 = 0;
			}
		}
		for (int k = 0; k < c1; k++) {
			System.out.println("impar[" + k + "] = " + imp[k]);
		}
		for (int k = 0; k < c2; k++) {
			System.out.println("par[" + k + "] = " + par[k]);
		}
	}

}