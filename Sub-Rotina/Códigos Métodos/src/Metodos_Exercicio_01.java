import java.util.Scanner;
public class Metodos_Exercicio_01
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		//Utiliza boolean para variaveis verdadeiro ou falso
		boolean positivo;
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		System.out.println("Teste #1");
		positivo = verificarPositivo(numero);
		System.out.println("Teste #2");
		if(positivo == true)
			System.out.println(numero + " é positivo");
		else
			System.out.println(numero + " é negativo");
		System.out.println("Teste #4");
		teclado.close();
	}
	
	public static boolean verificarPositivo(int numero)
	{
		System.out.println("Teste #3");
		if(numero >= 0) 
			return true;
		else
			return false;
	}

}
