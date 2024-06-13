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
		System.out.println("Digite (T) para tri�ngulo.");
		System.out.println("Digite (C) para c�rculo.");
		System.out.print("Informe sua op��o: ");
		opcao = teclado.nextLine().charAt(0);

		switch (opcao)
		{
			case 'Q': case 'q':
				System.out.print("Informe o valor do lado: ");
				lado = teclado.nextInt();
				area = (float)(Math.pow(lado, 2));
				System.out.println("�rea do  quadrado= " + area);
				break;
		
			case 'T': case 't':
				System.out.print("Informe o valor da base: ");
				base = teclado.nextInt();
				System.out.print("Informe o valor da altura: ");
				altura = teclado.nextInt();
				area = (base * altura)/2;
				System.out.println("�rea do tri�ngulo= " + area);
				break;

			case 'C': case 'c':
				System.out.print("Informe o valor do raio: ");
				raio = teclado.nextInt();
				area = (float)(Math.PI * Math.pow(raio, 2));
				System.out.printf("%s%2.1f%s", "�rea do  c�rculo= ", area, "\n");
				break;

			default:
				System.out.println("op��o INV�LIDA");
		}

		teclado.close();

	}

}
