import java.util.Scanner;
public class Estrutura_Condicional_Exercicio_01 
{

	public static void main(String[] args) 
	{
		float MS1, MS2, MF;
		
		MS1 = 0;
		MS2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a M�dia Semestral 1: " + MS1);
		MS1 = teclado.nextFloat();
		System.out.println("Informe a M�dia Semestral 2: " + MS2);
		MS2 = teclado.nextFloat();
		
		//Conta da m�dia final
		MF = (float)(0.4*MS1 + 0.6*MS2);
		System.out.println("M�dia Final = " + MF);
		
		if(MF >= 6)
			System.out.println("Aprovado! M�dia = " + MF);
		else
			if(MF >= 4)
				System.out.println("N�o desista! M�dia = " + MF);
			else
				System.out.println("Xiii.....");
		
		teclado.close();

	}

}
