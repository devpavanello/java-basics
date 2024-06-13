
public class Strings_Exercicio_04v3
{
	public static void main(String[] args)
	{
		int tamanho, p, i;
		String frase = new String("EU ESTUDO NA FIAP");
		String frase2x = "";
		
		tamanho = frase.length();
		p = 0;

		for (i = 0; i < tamanho; i++)
		{
			p = frase.indexOf(' ', i);
			if (p == -1)
				break;
			frase2x = frase2x + frase.substring(i, p+1) + frase.substring(i, p+1);
			i = p;
		}

		frase2x = frase2x + frase.substring(i, tamanho) + ' ' + frase.substring(i, tamanho);
		System.out.println("frase=\t" + frase);
		System.out.println("frase2x=" + frase2x);

	}

}
