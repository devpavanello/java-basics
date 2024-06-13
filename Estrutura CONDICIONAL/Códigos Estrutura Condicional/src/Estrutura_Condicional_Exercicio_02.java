import java.util.Scanner;
public class Estrutura_Condicional_Exercicio_02 
{

	public static void main(String[] args)
	{
		int A, B, C;
		int menor, meio, MAIOR;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = teclado.nextInt();
		System.out.println("Informe o valor de B: ");
		B = teclado.nextInt();
		System.out.println("Informe o valor de C: ");
		C = teclado.nextInt();
		
		menor = Math.min(A, Math.min(B, C));
		MAIOR = Math.max(A, Math.max(B, C));
		meio = A + B + C - menor - MAIOR;
		
		System.out.println("Ordem Crescente: ");
		System.out.println(menor + ", " + meio + ", " + MAIOR);
		
		teclado.close();
		
	}
}
