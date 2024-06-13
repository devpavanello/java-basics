import java.util.Scanner;
public class Estrutura_Case_Exercicio_04 
{

	public static void main(String[] args)
	{
		int mes, ano;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe um mês: ");
		mes = teclado.nextInt();
		System.out.print("Informe um ano: ");
		ano = teclado.nextInt();

		switch (mes)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(mes + "/" + ano + " tem 31 dias");
				break;

			case 2:
				boolean C1, C2;
				C1 = (ano % 400 == 0);
				C2 = ((ano % 4 == 0) && (ano % 100 != 0));
				int diasFev = 28;
				if (C1 || C2)
					diasFev = 29;
				System.out.println("2/" + ano + " tem " + diasFev + " dias");
				break;

			case 4: case 6: case 9: case 11:
				System.out.println(mes + "/" + ano + " tem 30 dias");
				break;

			default:
				System.out.println("mês INVÁLIDO!");
		}

		teclado.close();

	}

}
