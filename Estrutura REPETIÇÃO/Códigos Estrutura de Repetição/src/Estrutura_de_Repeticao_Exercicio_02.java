import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_02
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int N, retry;
		
		retry = 1;
		do
		{
			//Retry ele foi criado para aparecer o numero de tentativas que o usuario irá realizar.
			System.out.println("Informe N " + retry + "ªtentativa:");
			N = teclado.nextInt();
			//Ele sofre um incremento para ficar com primeira, segunda e terceira tentativa.
			retry++;
		}while(N <= 0 && retry <= 3);
		if(retry <= 3)
			System.out.println("N = " + N);
		else
			System.out.println("N de tentativas execidido.");
		teclado.close();
	}
}
