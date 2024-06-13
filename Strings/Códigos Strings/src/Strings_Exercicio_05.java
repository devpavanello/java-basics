import java.util.Scanner;
public class Strings_Exercicio_05
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String nome;
		// Aqui foi criado um vetor para armazenar pelo menos 1 string (que
		// seria o minimo).
		// E quando utilizamos o metódo split ele vai quebrando a palavra e ele
		// redimenssiona o tamanho deste vetor.
		String NOMES[] = new String[1];
		String nomeREF;
		int i;

		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine().toUpperCase();
		// O split ele identifica os espaços em branco como um elemento de
		// separação e não conta eles como posiçoes do vetor.
		NOMES = nome.split(" ");

		// nome de referencia = vetor nome [quantidade de elementos dentro dele
		// - 1]
		nomeREF = NOMES[NOMES.length - 1] + ", ";
		for (i = 0; i < NOMES.length - 1; i++)
			// Nessa estrutura de repetição pegamos o outros nomes atribuidos e
			// com charAt(0) pegamos somente a primeira letra.
			nomeREF = nomeREF + NOMES[i].charAt(0) + ". ";

		System.out.println("Nome: " + nome);
		// Usamos o trim para cancelar o espaço no final
		System.out.println("Nome REF: " + nomeREF.trim());

		teclado.close();

	}

}
