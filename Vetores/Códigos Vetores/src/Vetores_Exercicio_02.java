import java.util.Scanner;

public class Vetores_Exercicio_02
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		double vetR[] = new double[5];
		int opcao, i;

		for(i = 0; i < vetR.length; i++)
		{
			System.out.print("Informe o " + (i+1) + "º elemento: ");
			vetR[i] = teclado.nextDouble();
		}

		System.out.print("1-ordem direta, 2-ordem reversa: ");
		opcao = teclado.nextInt();

		if (opcao == 1)
			for(i = 0; i < vetR.length; i++)
				//System.out.print(vetR[i] + "; ");
				System.out.print(i != vetR.length-1? (vetR[i] + ", ") : vetR[i]);
		
		if (opcao == 2)
			for(i = vetR.length-1; i >=0; i--)
				System.out.print(vetR[i] + "; ");

		teclado.close();
	}
}