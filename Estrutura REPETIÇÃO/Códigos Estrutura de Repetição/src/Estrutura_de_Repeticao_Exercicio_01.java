import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_01
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int i, A, B, soma, mult, aux;
		
		System.out.println("Informe o valor de A: ");
		A = teclado.nextInt();
		System.out.println("Informe o valor de B: ");
		B = teclado.nextInt();
		
		if(A > B)
		{
			aux = A;
			A = B;
			B = aux;
		}
		
		soma = 0; 
		mult = 1;
		
		//Minha estrutura de repetição
		for(i = A;i <= B; i++)
		
			//Condição para o número ser par.
			if(i % 2 == 0)
				soma = soma + i;
			else
				//Condição se o número for impar.
				mult = mult * i;
		
		System.out.println("Soma = \t" + soma);
		System.out.println("Mult = \t" + mult);
		
		teclado.close();
	}
}
