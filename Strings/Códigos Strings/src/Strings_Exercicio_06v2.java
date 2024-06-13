import java.util.Scanner;

public class Strings_Exercicio_06v2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		StringBuffer crypt = new StringBuffer();
		int tamanho, i, codigo;
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		tamanho = frase.length();

		char caractere[] = frase.toCharArray();

		for (i = 0; i < tamanho; i++)
		{
	 		if (caractere[i] != ' ')
	 		{
				codigo = (int)caractere[i];
				codigo = codigo - 65 + 3;
				if (codigo > 25)
					codigo = codigo % 26;
				crypt.append(alfabeto.charAt(codigo));
	 		}
	 		else
				crypt.append(' ');
		}

		System.out.println("\nfrase normal = " + frase);
		System.out.println("frase cifrada= " + crypt);

		teclado.close();
	}
}

