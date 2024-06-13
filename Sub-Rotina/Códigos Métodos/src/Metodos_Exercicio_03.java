import java.util.Scanner;
public class Metodos_Exercicio_03 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int A, B, C, soma;
		
		System.out.println("Informe o valor de A: ");
		A = teclado.nextInt();
		System.out.println("Informe o valor de B: ");
		B = teclado.nextInt();
		System.out.println("Informe o valor de C: ");
		C = teclado.nextInt();
		
		soma = somaMultiplos(A, B, C);
		System.out.println("Soma dos múltiplos = " + soma);
		
		teclado.close();
	}
	
	public static int somaMultiplos(int A, int B, int C)
	{
		int i, soma;
		soma = 0;
		
		for(i = B; i <= C; i++)
			if(i % A == 0)
			    soma = soma + i;
		
		return soma;
		
	}

}
