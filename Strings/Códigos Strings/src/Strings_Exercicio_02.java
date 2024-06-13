import java.util.Scanner;
public class Strings_Exercicio_02 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int tamanho, i;
		String frase;
		String FRASE;
		
		System.out.println("Informe uma frase: ");
		frase = teclado.nextLine();
		FRASE = frase.toUpperCase();
		char crypt[] = frase.toCharArray();
		
		tamanho = frase.length();
		for(i = 0; i < tamanho; i++)
			if(FRASE.charAt(i)== 'A' ||
			   FRASE.charAt(i)== 'E' ||
			   FRASE.charAt(i)== 'I' ||
			   FRASE.charAt(i)== 'O' ||
			   FRASE.charAt(i)== 'U')
				crypt[i] = '*';
		
		System.out.println("Frase: " + frase);
		System.out.print("Crypt: ");
		for(i = 0; i < crypt.length; i++)
			System.out.print(crypt[i]);
			
		teclado.close();
	}
}

