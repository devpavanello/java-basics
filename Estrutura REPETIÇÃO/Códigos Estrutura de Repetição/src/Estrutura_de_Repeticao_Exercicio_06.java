import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_06 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int vezes, loops, i, N, fat;
		
		System.out.println("Quantas vezes quer calcular N: ");
		vezes = teclado.nextInt();
		
		loops = 0;
		while(loops < vezes)
		{
			System.out.println("Informe N (N>=0): ");
			N = teclado.nextInt();
			
			fat = 1;
			for(i = N; i > 1; i--)
				fat = fat * i;
			
			System.out.println(N + "!=" + fat);
			
			loops++;
		}
		
		teclado.close();

	}
}
