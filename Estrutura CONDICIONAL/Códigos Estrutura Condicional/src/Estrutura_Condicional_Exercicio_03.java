import java.util.Scanner;
public class Estrutura_Condicional_Exercicio_03 
{

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int A, B, C;
		boolean cd1, cd2, cd3;

		System.out.print("Informe A: ");
		A = entrada.nextInt();
		System.out.print("Informe B: ");
		B = entrada.nextInt();
		System.out.print("Informe C: ");
		C = entrada.nextInt();

		cd1 = (Math.abs(B-C) < A) && (A < B+C);
		cd2 = (Math.abs(A-C) < B) && (B < A+C);
		cd3 = (Math.abs(B-A) < C) && (C < B+A);

		if (cd1 && cd2 && cd3)
		{
			System.out.println("É um triângulo.");
			if ((A == B) && (B == C))
				System.out.println("Equilátero.");
			else
				if ((A != B) && (B != C) && (A != C))
					System.out.println("Escaleno.");
				else
					System.out.println("Isósceles.");
		}
		else
			System.out.println("NÃO É um triângulo ");

		entrada.close();

	}

}
