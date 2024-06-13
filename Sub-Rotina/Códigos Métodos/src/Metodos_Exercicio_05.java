
public class Metodos_Exercicio_05 
{

	public static void main(String[] args)
	{
		int vetor [] = {1, 2, -3, 4, -5};
		int i;
		
		System.out.print("vetor[](ini): ");
		for(i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + ", ");
		
		System.out.println();
		
		trocarNegativos(vetor);
		
		System.out.print("vetor[](depois): ");
		for(i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + ", ");
	}
	
	//Colocamos void quando não retorna nada para a minha função main.
	public static void trocarNegativos(int vetor[])
	{
		int i;
		
		for(i = 0; i < vetor.length; i++)
			if(vetor[i] < 0)
				vetor[i] = 0;
	}
}
