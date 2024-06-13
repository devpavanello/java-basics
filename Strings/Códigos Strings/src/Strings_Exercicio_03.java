import java.util.Scanner;

public class Strings_Exercicio_03 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		//Objeto da classe String para receber a frase
		String frase;
		//Boolean é para responder se é verdadeiro ou falso.
		boolean palindrome = true;
		//Dois indices para fazer a varredura da esquerda para direita e inverso.
		//i é esquerda para direita 
		//j é direita para esquerda
		int i, j;
		
		//ENTRADA
		System.out.println("Digite uma frase: ");
		//nextLine para receber a linha inteira digitada
		frase = teclado.nextLine().toUpperCase();
		
		//PROCESSAMENTO
		//toCharArray serve para transformar uma String em um vetor de caracteres.
		char palavra[] = frase.toCharArray();
		
		//J esta sendo poscionado no ultimo indice do meu vetor
		j = palavra.length - 1;
		for(i = 0; i < palavra.length; i++)
			if(palavra[i] == palavra[j])
			{
				//Sofre decremento para contnuar fazendo a analise
				j--;
			}
			else
			{
				//Quando nota que é diferente, ele sai da minha estrutura.
				palindrome = false;
				break;
			}
		
		//Saída
		if(palindrome == true)
			System.out.println("A palavra " + frase + " é palindrome!");
		else
			System.out.println("A palavra " + frase + " não é palindrome");
		
		teclado.close();
	}

}
