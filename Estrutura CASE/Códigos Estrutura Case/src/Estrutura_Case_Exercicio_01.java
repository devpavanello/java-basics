import java.util.Scanner;
public class Estrutura_Case_Exercicio_01
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("Digite (1) para exibir o número de Euler.");
		System.out.println("Digite (2) para exibir o número Pi.");
		System.out.print("Informe sua opção: ");
		opcao = teclado.nextInt();

		switch (opcao)
		{
			case 1:
				System.out.println("\nNº Euler:\t" + Math.E);
				break;
			case 2:
				System.out.println("Pi:2\t\t" + Math.PI);
				break;
			default:
				System.out.println("opção INVÁLIDA!");
				break;
		}
		
		teclado.close();

	}
}
