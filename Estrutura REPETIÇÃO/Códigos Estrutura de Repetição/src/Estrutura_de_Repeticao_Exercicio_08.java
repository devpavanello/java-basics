import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_08
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int i, N, Fn, Fn1, Fn2;
		
		System.out.println("Nºs da Sequência de Fibonacci: ");
		N = teclado.nextInt();
		
		//0, 1, 1, 2, 3, 5, 8...
		Fn2 = 0; 
		Fn1 = 1;
		Fn = 0;
		
		for(i = 1; i <= N; i++)
		{
			System.out.print(Fn + ", ");
			Fn = Fn1 + Fn2;
			if(i > 1)
				Fn2 = Fn1;
			Fn1 = Fn;
		}
		
		teclado.close();

	}

}
