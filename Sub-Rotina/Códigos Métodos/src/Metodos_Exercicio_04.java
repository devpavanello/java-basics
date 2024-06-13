
public class Metodos_Exercicio_04 
{

	public static void main(String[] args)
	{
		int perfeitos[] = new int [3];
		int i;
		
		perfeitos = retornarPerfeitos();
		System.out.print("3°s N°s perfeitos: ");
		for(i = 0;  i < perfeitos.length; i++)
			System.out.print(perfeitos[i] + ", ");
	}
	
	//Quando for um metodo de vetor. Colocar colchetes para representar vetor.
	public static int[] retornarPerfeitos()
	{
		int vetor[] = new int[3];
		//Indices: i e contador
		int N, soma, i, contador; 
		
		contador = 0;
		N = 1;
		
		//Aqui ele pega os tres primeiros números perfeitos.
		while(contador < 3)
		{
			soma = 0;
			//Começa em 1 pois nao tem como dividir por 0.
			for(i = 1; i < N; i++)
				//Verificando se é uma divisão exata.
				if(N % i == 0)
					soma = soma + i;
			
			if(soma == N)
			{
				//Salvando números perfeitos no meu vetor. E o meu indice sofre incremento para passar para proxima posição.
				vetor[contador] = N;
				contador++;
			}
			//Sofre incremento para passar para o outro número. Começa em 1 ...
			N++;
		}
		
		return vetor;
	}

}