import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		String a, b, c;
		Scanner scan = new Scanner(System.in);
		a = scan.next();
		b = scan.next();
		c = scan.next();

		if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
			System.out.print("aguia\n");
		}
		if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
			System.out.print("pomba\n");
		}
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
			System.out.print("homem\n");
		}
		if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
			System.out.print("vaca\n");
		}

		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
			System.out.print("pulga\n");
		}
		if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
			System.out.print("lagarta\n");
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
			System.out.print("sanguessuga\n");
		}
		if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
			System.out.print("minhoca\n");
		}
		scan.close();

	}

}
