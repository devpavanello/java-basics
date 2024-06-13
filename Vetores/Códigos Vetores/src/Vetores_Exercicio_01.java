import java.util.Scanner;

public class Vetores_Exercicio_01
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int vetX[] = new int[5];
		int vetY[] = new int[5];
		int vetI[] = new int[10];
		int i;

		for(i = 0; i < vetX.length; i++)
		{
			System.out.print("Informe o " + (i+1) + "º elemento: ");
			vetX[i] = teclado.nextInt();
		}

		System.out.println();
		for(i = 0; i < vetY.length; i++)
		{
			System.out.print("Informe o " + (i+1) + "º elemento: ");
			vetY[i] = teclado.nextInt();
		}

		for(i = 0; i < vetX.length; i++)
		{
			vetI[2*i] = vetX[i];
			vetI[2*i+1] = vetY[i];
		}

		System.out.println();
		System.out.print("vetX[]= ");
		for(i = 0; i < vetX.length; i++)
			System.out.print(vetX[i] + ", ");

		System.out.println();
		System.out.print("vetY[]= ");
		for(i = 0; i < vetY.length; i++)
			System.out.print(vetY[i] + ", ");

		System.out.println();
		System.out.print("vetI[]= ");
		for(i = 0; i < vetI.length; i++)
			System.out.print(vetI[i] + ", ");

		teclado.close();
	}
}
