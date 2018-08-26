import java.util.Locale;
import java.util.Scanner;

public class URI2126 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int cs = 1;
		String sub, str;

		while (scan.hasNext()) {
			sub = scan.nextLine();
			str = scan.nextLine();
			int qs = 0, lst_pos = 0;

			for (int i = 0; i <= str.length() - sub.length(); i++) {
				boolean is_sub = true;
				for (int j = 0; j < sub.length() && is_sub; j++)
					is_sub = (sub.charAt(j) == str.charAt(i + j));
				if (is_sub) {
					qs++;
					if (i + 1 > lst_pos)
						lst_pos = i + 1;
				}
			}

			System.out.println("Caso #" + cs++ + ":" );
			if (qs != 0) {
				System.out.println("Qtd.Subsequencias: " + qs + "\nPos: " + lst_pos + "\n\n");
			} else {
				System.out.println("Nao existe subsequencia\n\n");
			}
		}
		scan.close();
	}
}

