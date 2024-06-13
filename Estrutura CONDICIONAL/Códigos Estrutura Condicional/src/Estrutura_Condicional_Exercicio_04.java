import java.util.Scanner;
public class Estrutura_Condicional_Exercicio_04
{

	public static void main(String[] args)
	{
		int A, B, C;
		boolean ce1, ce2, ce3;
		int hip, ct1, ct2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor de A: ");
		A = teclado.nextInt();
		System.out.println("Informe o valor de B: ");
		B = teclado.nextInt();
		System.out.println("Informe o valor de C: ");
		C = teclado.nextInt();

		ce1 = (Math.abs(B-C) < A) && (A < B+C);
		ce2 = (Math.abs(A-C) < B) && (B < A+C);
		ce3 = (Math.abs(B-A) < C) && (C < B+A);

		if (ce1 && ce2 && ce3)
		{
			System.out.println("É um triângulo ");
			if ((A == B) && (B == C))
				System.out.println("Equilátero");
			else
				if ((A != B) && (A != C) && (B != C))
				{
					System.out.println("Escaleno");
					hip = Math.max(A, Math.max(B, C));
					ct2 = Math.min(A, Math.min(B, C));
					ct1 = A + B + C - hip - ct2;
					if (Math.pow(hip,2) == Math.pow(ct1,2) + Math.pow(ct2,2))
						System.out.println("Retângulo");
				}
				else
					System.out.println("Isósceles");
		}
		else
			System.out.println("NÃO é triângulo!");
			
		teclado.close();

	}
}
