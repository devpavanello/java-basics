import java.util.Scanner;

public class Strings_Exercicio_06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		StringBuffer crypt = new StringBuffer();
		int tamanho, i, codigo;

		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		tamanho = frase.length();

		char caractere[] = frase.toCharArray();

		for (i = 0; i < tamanho; i++) {
			if (caractere[i] != ' ') {
				if (caractere[i] == 'X' || caractere[i] == 'Y' || caractere[i] == 'Z') {
					if (caractere[i] == 'X')
						caractere[i] = 'A';
					if (caractere[i] == 'Y')
						caractere[i] = 'B';
					if (caractere[i] == 'Z')
						caractere[i] = 'C';
					codigo = (int) caractere[i];
				} else {
					codigo = (int) caractere[i];
					codigo = codigo + 3;
				}

				crypt.append((char) codigo);
			} else {
				crypt.append(' ');
			}
		}

		System.out.println("\nfrase normal = " + frase);
		System.out.println("frase cifrada= " + crypt);

		teclado.close();
	}
}
