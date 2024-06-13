import java.util.Random;

public class SubCadeias
{
	public static final int ALFABETO = 26;
	public static final int LETRAS = 7;

	public static void main(String[] args)
	{
		String cadeia = new String();
		int tamanho, i, max, contador, p, posicao;

		cadeia = gerarCadeia();
		System.out.println("cadeia= " + cadeia);

		tamanho = cadeia.length();
		max = 0;
		contador = 1;	// aa
		p = 0;
		posicao = 0;
		for (i = 0; i < tamanho - 1; i++)
		{
			if (cadeia.charAt(i) == cadeia.charAt(i+1))
				contador++;
			else
			{
				if (contador > max)
				{
					max = contador;
					posicao = p;
				}
				p = i+1;
				contador = 1;
			}
		}
			
		if (contador > max)
		{
			max = contador;
			posicao = p;
		}

		System.out.println();
		System.out.print("MAIOR sequência= " + max + ": ");
		for (i = posicao; i < posicao+max; i++)
			System.out.print(cadeia.charAt(i));
	}

	public static String gerarCadeia()
	{
		String cadeia = new String();
		String letras = "abcdefghijklmnopqrstuvwxyz";
		int letra, N, i, j;
		int vetor[] = new int[LETRAS];
		Random r = new Random();

		for (i = 0; i < LETRAS; i++)
		{
			vetor[i] = r.nextInt(10)+1;
			for (j = 0; j < i; j++)
				if (vetor[i] == vetor[j])
				{
					i--;
					break;
				}
		}
		
		for (i = 0; i < LETRAS; i++)
		{
			letra = r.nextInt(ALFABETO);
			N = vetor[i];
			for (j = 0; j < N; j++)
				cadeia = cadeia + letras.charAt(letra);
		}
		
		return cadeia;
	}
}
