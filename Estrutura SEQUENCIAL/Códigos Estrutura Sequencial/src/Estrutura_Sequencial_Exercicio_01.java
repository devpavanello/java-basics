import java.util.Scanner;
public class Estrutura_Sequencial_Exercicio_01 
{

	public static void main(String[] args) 
	{
		int A, B, C, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um valor para A: ");
		A = teclado.nextInt();
		System.out.println("Informe um valor para B: ");
		B = teclado.nextInt();
		System.out.println("Informe um valor para C: ");
		C = teclado.nextInt();
		
		soma = A + B + C;
		System.out.println("Soma: " + soma);
		
		teclado.close();

	}

}
