import java.util.Scanner;
public class Estrutura_Case_Exercicio_01
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("Digite (1) para exibir o n�mero de Euler.");
		System.out.println("Digite (2) para exibir o n�mero Pi.");
		System.out.print("Informe sua op��o: ");
		opcao = teclado.nextInt();

		switch (opcao)
		{
			case 1:
				System.out.println("\nN� Euler:\t" + Math.E);
				break;
			case 2:
				System.out.println("Pi:2\t\t" + Math.PI);
				break;
			default:
				System.out.println("op��o INV�LIDA!");
				break;
		}
		
		teclado.close();

	}
}
