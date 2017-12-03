import java.util.Locale;
import java.util.Scanner;

public class URI2059 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int p, j1, j2, r, a, soma, ganha;
		ganha = 0;
		p = scan.nextInt();
		j1 = scan.nextInt();
		j2 = scan.nextInt();
		r = scan.nextInt();
		a = scan.nextInt();
		soma = j1 + j2;
		if (p == 1) {
			if (soma % 2 == 0) {
				if (r == 0 && a == 0) {
					System.out.printf("Jogador 1 ganha!\n");

				} else {
					if (r == 1 && a == 0) {
						ganha = 1;
					} else {
						if (r == 1 && a == 1) {
							ganha = 2;
						} else {
							if (r == 0 && a == 1) {
								ganha = 1;
							}
						}
					}
				}
			} else {
				if (soma % 2 != 0) {
					if (r == 0 && a == 0) {
						System.out.printf("Jogador 2 ganha!\n");
					} else {
						if (r == 1 && a == 0) {
							ganha = 1;
						} else {
							if (r == 1 && a == 1) {
								ganha = 2;
							} else {
								if (r == 0 && a == 1) {
									ganha = 1;
								}
							}
						}
					}
				}
			}
		} else {
			if (soma % 2 != 0) {
				if (r == 0 && a == 0) {
					System.out.printf("Jogador 1 ganha!\n");

				} else {
					if (r == 1 && a == 0) {
						ganha = 1;
					} else {
						if (r == 1 && a == 1) {
							ganha = 2;
						} else {
							if (r == 0 && a == 1) {
								ganha = 1;
							}
						}
					}
				}
			} else {
				if (soma % 2 == 0) {
					if (r == 0 && a == 0) {
						System.out.printf("Jogador 2 ganha!\n");
					} else {
						if (r == 1 && a == 0) {
							ganha = 1;
						} else {
							if (r == 1 && a == 1) {
								ganha = 2;
							} else {
								if (r == 0 && a == 1) {
									ganha = 1;
								}
							}
						}
					}
				}
			}
		}
		if (ganha == 1) {
			System.out.printf("Jogador 1 ganha!\n");
		} else {
			if (ganha == 2) {
				System.out.printf("Jogador 2 ganha!\n");
			}
		}
		scan.close();
	}
}
