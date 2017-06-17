
public class URI1098 {

	public static void main(String[] args) {
		float i, j, t;
		int a1, a2;
		for (i = 0, j = 1, t = 0, a1 = 0, a2 = 0; i < 2.2; j++){
			if (a2 == 0) {
				System.out.printf("I=%.0f J=%.0f\n", i, j);
			} else {
				System.out.printf("I=%.1f J=%.1f\n", i, j);
			}
			a1++;

			if (a1 == 3) {
				i += 0.2;
				t += 0.2;
				j = t;
				a1 = 0;
				a2++;
			}
			if (a2 == 5)
				a2 = 0;
		}
	}
}