import java.util.Scanner;
public class Strings_Exercicio_01 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		String FRASE;
		int vogais, i;
		
		System.out.println("Informe uma frase: ");
		//nextLine: ele pega a frase por inteira.
		//next: ele pega até o primeiro espaço da frase
		frase = teclado.nextLine();
		//Conversão para letras maiusculas. Lembra de criar uma nova String para armazenar o conteudo maiusculo.
		FRASE = frase.toUpperCase();
		System.out.println("frase = " + frase);
		System.out.println("FRASE = " + FRASE);
		
		//inicializando a variavel vogais. Para ela ter um ponto de partida.
		vogais = 0;
		//Estrutura de repetição para fazer a varredura da minha frase por completo.
		for(i = 0; i < FRASE.length(); i++)
			if(FRASE.charAt(i)== 'A' ||
			   FRASE.charAt(i)== 'E' ||
			   FRASE.charAt(i)== 'I' ||
			   FRASE.charAt(i)== 'O' ||
			   FRASE.charAt(i)== 'U')
				//vogais é para fazer a varredura das letras vogais na minha frase.
				vogais++;
			
			System.out.println("A frase digitada tem " + vogais + " vogais.");
			//charAt ele que faz a parte de obter as letras da String FRASE
			//System.out.println(FRASE.charAt(i));
		teclado.close();
	}
}

