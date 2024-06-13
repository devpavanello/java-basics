import java.util.Scanner;
public class Metodos_Exercicio_02 
{

	//Aqui � a minha fun��o MAIN. Onde eu pe�o para o usuario os dois valores e mostro o resultado da soma.
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int A, B, soma;
		
		System.out.println("Informe o primeiro n�mero: ");
		A = teclado.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		B = teclado.nextInt();
		
		//Aqui � onde eu estou chamando o meu m�todo para ele ser implementado dentro da fun��o main.
		soma = somaIntervalo(A, B);
		System.out.println("A soma do intervalo [" + A + "," + B + "] = " + soma);
		teclado.close();
	}
	
	//Cria��o do M�todo 
	//� public static int pois o valor que ser� na soma � do tipo inteiro.
	//As variaveis I e F s�o variaveis locais deste m�todo.
	//A ordem � super importante. Int I recebe o valor de A. Int F recebe o valor de B.
	public static int somaIntervalo(int I, int F)
	{
		//i � a variavel de controle
		//soma � a minha variavel de soma dos intervalos.
		int i, soma;
		
		soma = 0;
		for(i = I; i <= F; i++)
			soma = soma + i;
		//Return soma ele retorna o valor para a minha fun��o main.
		return soma;
	}
}