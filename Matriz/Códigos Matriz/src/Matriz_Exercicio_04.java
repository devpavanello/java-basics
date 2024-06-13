import java.util.Random;

public class Matriz_Exercicio_04 {

	public static void main(String[] args) {
		// Criação da matriz
		// O primeiro colchetes é para linha [4] e o segundo para coluna [5]
		int M[][] = new int[4][5];
		// Criando os indices
		// i - para fazer a varredura de linha
		// j - para fazer a varredura de coluna
		int i, j;
		// Para fazer valores randomicos
		Random r = new Random();
		// Criação das variaveis
		// MINMAX - é para achar o maior elemento onde nós temos o menor elemento
		int MINMAX, linhaMINMAX, colunaMINMAX, menor;

		for (i = 0; i < M.length; i++)// Linhas
			for (j = 0; j < M.length; j++)// Colunas
				// Para fazer a varredura da minha linha com a coluna de 100 números aleatorios
				M[i][j] = r.nextInt(100) + 1;

		// Criando um ponto de partida, para ter uma referencia de qual será o menor
		// número da matriz
		menor = M[0][0];
		linhaMINMAX = 0;
		for (i = 0; i < M.length; i++)// Linhas
			for (j = 0; j < M.length; j++)// Colunas
				if (M[i][j] < menor) {
					menor = M[i][j];
					linhaMINMAX = i;
				}

		MINMAX = M[linhaMINMAX][0];
		colunaMINMAX = 0;
		for (j = 0; j < M.length; j++)
			if (M[linhaMINMAX][j] > MINMAX) {
				MINMAX = M[linhaMINMAX][j];
				colunaMINMAX = j;
			}
		System.out.println("M[][]=");
		for (i = 0; i < M.length; i++)// Linhas
		{
			for (j = 0; j < M.length; j++)// Colunas
				System.out.print("\t" + M[i][j]);

			System.out.println();
		}

		// \n é para pular mais uma linha. E \t para pular mais uma coluna
		// Sempre contar coluna e linha começando de 0.
		System.out.println("\nMenor = " + menor);
		System.out.println("MINMAX = " + MINMAX);
		System.out.println("Linha MINMAX = " + linhaMINMAX);
		System.out.println("Coluna MINMAX = " + colunaMINMAX);

	}

}
