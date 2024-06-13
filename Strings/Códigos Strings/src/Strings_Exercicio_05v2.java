import java.util.Scanner;

public class Strings_Exercicio_05v2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nome;
		StringBuffer nomeREF = new StringBuffer();
		int espacos, i;

		System.out.print("Informe o nome do(a) autor(a): ");
		nome = teclado.nextLine();
		nome = nome.replace(" das ", " da ");
		nome = nome.replace(" dos ", " do ");		
		nome = nome.replaceAll(" d[aeo] ", " ");
		nome = nome.replaceAll(" e ", " ");
		nome = nome.replaceAll(" d\'", " ");
		nome = nome.toUpperCase();

		espacos = 0;
		for(i = 0; i < nome.length(); i++)
			if (nome.charAt(i) == ' ')
				espacos++;

		String nomes[] = new String[espacos+1];
		nomes = nome.split(" ");

		System.out.println();
		nomeREF.append(nomes[espacos]);
		nomeREF.append(", ");
		for(i = 0; i < nomes.length - 1; i++)
		{
			nomeREF.append(nomes[i].charAt(0));
			nomeREF.append(". ");
		}
		
		System.out.println(nome);
		System.out.println(nomeREF.toString().trim());

		teclado.close();
	}
}

