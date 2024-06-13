import java.util.Random;
public class Matriz_Exercicio_03
{

	public static void main(String[] args)
	{
		Random r = new Random();
		int M[][] = new int[4][3]; 
		int R[][] = new int [4][3];
		int i, j;
		
		for(i=0; i < M.length; i++)
			for(j=0; j < M[0].length; j++)
				M[i][j] = r.nextInt(20)+1;
		
		for(i=0; i < M.length; i++)
			for(j=0; j < M[0].length; j++)
				if(M[i][j] > 7)
					R[i][j] = 0;
				else
					R[i][j] = M[i][j];
		
		System.out.println();
		System.out.println("M[][]= ");
		for(i=0; i < M.length; i++) 
		{
			for(j=0; j < M[0].length; j++)
				System.out.print("\t" + M[i][j]);
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("R[][] = ");
		for(i=0; i < M.length; i++) 
		{
			for(j=0; j < M[0].length; j++)
				System.out.print("\t" + R[i][j]);
			System.out.println();
		}

	}

}
