import java.util.Random;
public class Vetores_Exercicio_Dado 
{

	    //Comentarios
		//Criar um novo projeto toda vez para n�o ter bagun�a com o main
		//Usamos .length para n�o termos que colocar 10 e se formos mudar a aplica��o � s� mudar uma vez na parte de cima (Linha 14)
		//Operadores de incremento (+) e decremento (-)
		//i++; i=i+1; / i--; i=i-1;
	public static void main(String[] args) 
	{
		
		Random r = new Random();
		int dado[] = new int [10];
		int face [] = { 0, 0, 0, 0, 0, 0 }; 
		int i;
		
		for(i = 0; i < dado.length; i++)
		{
			dado[i] = r.nextInt(6)+1;
			face[dado[i]-1]++;
		}
		
		System.out.print("dado[]= ");
		for(i = 0; i < dado.length; i++)
		//Termina��o normal. Aparece uma virgula ap�s o ultimo numero.
			//System.out.print(dado[i] + ", ");
		//Operador Tern�rio
		System.out.print((i != dado.length-1)? (dado[i] + ", "): dado[i]);
		
		System.out.println();
		System.out.print("face[]= ");
		for(i = 0; i < face.length; i++)
			System.out.print(face[i] + ", ");
		
		System.out.println();
		for(i = 0; i < face.length; i++)
			System.out.println("face " + (i+1) + ": " + face[i] + " vezes");


	}

}
