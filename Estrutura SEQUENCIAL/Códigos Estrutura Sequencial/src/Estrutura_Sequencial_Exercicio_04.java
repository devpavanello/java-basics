import java.util.Scanner;
public class Estrutura_Sequencial_Exercicio_04 
{

	public static void main(String[] args)
	{
		int lado, perimetro;
		double area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o lado do hexágono: ");
		lado = teclado.nextInt();
		perimetro = 6 * lado;
		//Cálculo realizado: 3 * Raiz quadrada de 3 * lado elevado ao quadrado dividido por 2.
		area = (3 * Math.sqrt(3)* Math.pow(lado, 2))/2;
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		//Aqui foi realizado o arredondamento da area
		System.out.printf("%s%2.1f", "Área = ", area);
		
		teclado.close();

	}

}
