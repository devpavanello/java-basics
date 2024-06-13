import java.util.Scanner;

public class Excecoes
{
	public static void main(String[] args)
	{
		int X, Y, soma;
		Scanner teclado = new Scanner(System.in);

		try
		{
			System.out.print("Informe o valor de X: ");
			X = teclado.nextInt();

			System.out.print("Informe o valor de Y: ");
			Y = teclado.nextInt();

			soma = X + Y;
			System.out.println("soma= " + soma);
		}
		catch(Exception e)
		{
			System.out.println("!!! EXCEÇÃO  !!!");
			System.out.println("mensagem: " + e.getMessage());
			e.printStackTrace(System.out);
		}

		teclado.close();
	}
}