import java.util.Scanner;
public class Estrutura_Case_Exercicio_02 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		char opcao;
		int base, altura, lado, raio;
		float area;

		System.out.println("Digite (Q) para quadrado.");
		System.out.println("Digite (T) para triângulo.");
		System.out.println("Digite (C) para círculo.");
		System.out.print("Informe sua opção: ");
		opcao = teclado.nextLine().charAt(0);

		switch (opcao)
		{
			case 'Q': case 'q':
				System.out.print("Informe o valor do lado: ");
				lado = teclado.nextInt();
				area = (float)(Math.pow(lado, 2));
				System.out.println("área do  quadrado= " + area);
				break;
		
			case 'T': case 't':
				System.out.print("Informe o valor da base: ");
				base = teclado.nextInt();
				System.out.print("Informe o valor da altura: ");
				altura = teclado.nextInt();
				area = (base * altura)/2;
				System.out.println("área do triângulo= " + area);
				break;

			case 'C': case 'c':
				System.out.print("Informe o valor do raio: ");
				raio = teclado.nextInt();
				area = (float)(Math.PI * Math.pow(raio, 2));
				System.out.printf("%s%2.1f%s", "área do  círculo= ", area, "\n");
				break;

			default:
				System.out.println("opção INVÁLIDA");
		}

		teclado.close();

	}

}
