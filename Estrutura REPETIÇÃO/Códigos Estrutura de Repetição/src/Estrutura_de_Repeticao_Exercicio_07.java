import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_07 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int N, divisores, i;
		
		System.out.println("Informe o valor de N (N>0): ");
		N = teclado.nextInt();
		teclado.close();
		
		divisores = 0;
		for(i = 1; i <= N; i++)
			if(N % i == 0)
				divisores++;
		
		if(divisores == 2)
			System.out.println("O nº " + N + " é um nº primo.");
		else
			System.out.println("O nº " + N + " não é um nº primo.");
	}
}
