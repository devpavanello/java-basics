import java.util.Scanner;
import java.text.DecimalFormat;

public class Estrutura_de_Repeticao_Exercicio_04 
{

	public static void main(String[] args)
	{
		int i, N;
		long fat;
		Scanner teclado = new Scanner(System.in);
		//DecimalFormat classe = new DecimalFormat("000,000,000,000");
		DecimalFormat classe = new DecimalFormat("R$ ###,###,###.00");
		
		System.out.println("Informe N: ");
		N = teclado.nextInt();
		
		System.out.println(">>> N! for <<<");
		
		fat = 1;
		for(i = N; i > 1; i--)
			fat = fat + i;
		
		System.out.println(N + "!=" + fat);
		
		System.out.println(">>> N! while <<<");
		
		fat=1;
		i = N;
		while(i > 1)
		{
			fat = fat * i;
			i--;
		}
		
		System.out.println(N + "!=" + fat);
		
		System.out.println(">>> N! do-while <<<");
		
		fat = 1;
		i = 1;
		do
		{
			fat = fat*i;
			i++;
		}while(i <= N);
		
		System.out.println(N + "!=" + classe.format(fat));
		
		teclado.close();

	}

}
