import java.util.Scanner;
public class Estrutura_Sequencial_Exercicio_02
{

	public static void main(String[] args)
	{
		float nota1, nota2, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = teclado.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = teclado.nextFloat();
		
		media = (nota1 + nota2)/2;
		System.out.println("Média: " + media);
		
		teclado.close();

	}

}
