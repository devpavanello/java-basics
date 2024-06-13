import java.util.Scanner;
public class Estrutura_Sequencial_Exercicio_03
{

	public static void main(String[] args)
	{
		int raio;
		float area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		raio = teclado.nextInt();
		
		//Conta realizada: PI * raio elevado ao quadrado.
		area = (float)(Math.PI * Math.pow(raio, 2));
		System.out.println("Área: " + area);
		
		teclado.close();

	}

}
