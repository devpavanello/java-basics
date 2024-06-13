import java.util.Scanner;
public class Metodos_Exercicio_02 
{

	//Aqui é a minha função MAIN. Onde eu peço para o usuario os dois valores e mostro o resultado da soma.
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int A, B, soma;
		
		System.out.println("Informe o primeiro número: ");
		A = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		B = teclado.nextInt();
		
		//Aqui é onde eu estou chamando o meu método para ele ser implementado dentro da função main.
		soma = somaIntervalo(A, B);
		System.out.println("A soma do intervalo [" + A + "," + B + "] = " + soma);
		teclado.close();
	}
	
	//Criação do Método 
	//É public static int pois o valor que será na soma é do tipo inteiro.
	//As variaveis I e F são variaveis locais deste método.
	//A ordem é super importante. Int I recebe o valor de A. Int F recebe o valor de B.
	public static int somaIntervalo(int I, int F)
	{
		//i é a variavel de controle
		//soma é a minha variavel de soma dos intervalos.
		int i, soma;
		
		soma = 0;
		for(i = I; i <= F; i++)
			soma = soma + i;
		//Return soma ele retorna o valor para a minha função main.
		return soma;
	}
}