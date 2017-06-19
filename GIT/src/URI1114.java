import java.util.Locale;
import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		int s;
		boolean v;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		v = false;
		while(!v){
			s = scan.nextInt();
			if(s == 2002){
				System.out.println("Acesso Permitido");
				v = true;
			}else{
				System.out.println("Senha Invalida");
				v = false;
			}
		}
		scan.close();
	}

}
