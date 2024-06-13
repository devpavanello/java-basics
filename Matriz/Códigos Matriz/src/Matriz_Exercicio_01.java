import java.util.Scanner;

public class Matriz_Exercicio_01 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		// Lembrar que sempre come�a de 0 e vai at� o numero que desejamos. Como: Linha 0 Coluna 0, 01, 10, 11
		
		//Cria��o de duas matrizes 2 por 2.
		int M[][] = new int [2][2]; 
		int R[][] = new int [2][2];
		//Necessitamos de dois indices para fazer a varredura 
		//Variavel i - faz a varredura por linha 
		//Variavel j - faz a varredura por coluna
		int i, j;
		//E precisamos de uma variavel para indicar o Maior.
		int MAIOR;
		
		//Primeira Matriz
		for(i = 0; i < M.length; i++) //Primeira dimens�o 
			for(j = 0; j < M[0].length; j++) //Segunda dimens�o
			{
				System.out.print("Elemento linha " + i + " coluna " + j + ": ");
				M[i][j] = teclado.nextInt();
			}
		System.out.println("M[][]=");
		for(i = 0; i < M.length; i++) //Primeira dimens�o
		{
			for(j = 0; j < M[0].length; j++)//Segunda dimens�o
				System.out.print("\t" + M[i][j]);
			
			System.out.println();
		}
		
		//Saber qual � o MAIOR n�mero
		//Elemento de referencia ou ponto de partida para saber se o segundo ser� maior ou menor que o primeiro.
		MAIOR = M[0][0];
		for(i = 0; i < M.length; i++)//Primeira dimens�o
			for(j = 0; j < M[0].length; j++)//Segunda dimens�o
				if(M[i][j] > MAIOR)
					MAIOR = M[i][j];
		
		System.out.println("Maior = " + MAIOR);
		
		//Segunda Matriz
		for(i = 0; i < R.length; i++)//Primeira dimens�o
			for(j = 0; j < R[0].length; j++)//Segunda dimens�o
				R[i][j] = MAIOR*M[i][j];
		
		System.out.println("M[][]=");
		
		for(i = 0; i < R.length; i++)//Primeira dimens�o
		{
			for(j= 0; j < R[0].length; j++)//Segunda dimens�o
				System.out.print("\t" + R[i][j]);
			
			System.out.println();
		}
				
		teclado.close();
	}

}
