import java.util.Random;
import java.util.Scanner;

public class Checkpoint_06 {

	public static final int SENHA = 12;
	public static final int ALFABETO = 26;
	public static final int DIGITOS = 10;
	public static final int ESPECIAIS = 12;
	public static final int SIMBOLOS = 4;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome;
		StringBuffer user = new StringBuffer();
		int i;

		try {
			System.out.print("Informe seu nome: ");
			nome = input.nextLine();
		}

		finally {
			input.close();
		}

		nome.trim().toLowerCase();
		System.out.println("Nome: " + nome);
		String NOMES[] = nome.split(" ");

		for (i = 0; i < NOMES.length - 1; i++) {
			user.append(NOMES[i].charAt(0));

		}
		user.append(NOMES[NOMES.length - 1]);

		System.out.println("Login: " + user.toString().toLowerCase());
		System.out.println("Senha: " + PasswordGenerator());

	}

	public static String PasswordGenerator() {

		String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letras = "abcdefghijklmnopqrstuvwxyz";
		String digitos = "0123456789";
		String especiais = "!?@#$%&*<>:;";
		String senha = "";
		Random R = new Random();
		int N, i;
		int LT, lt, dg, es;

		LT = SENHA / SIMBOLOS;
		lt = LT;
		dg = LT;
		es = LT;

		for (i = 0; i < SENHA; i++) {

			N = R.nextInt(SIMBOLOS);

			switch (N) {

			case 0:
				if (LT > 0) {
					senha += LETRAS.charAt(R.nextInt(ALFABETO));
					LT--;
				} else
					i--;

				break;

			case 1:
				if (lt > 0) {
					senha += letras.charAt(R.nextInt(ALFABETO));
					lt--;
				} else
					i--;
				break;

			case 2:
				if (dg > 0) {
					senha += digitos.charAt(R.nextInt(DIGITOS));
					dg--;
				} else
					i--;
				break;

			case 3:
				if (es > 0) {
					senha += especiais.charAt(R.nextInt(ESPECIAIS));
					es--;
				} else
					i--;
				break;
			}

		}

		return senha;

	}

}
