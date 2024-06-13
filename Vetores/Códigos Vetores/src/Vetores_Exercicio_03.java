import java.util.Random;

public class Vetores_Exercicio_03
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int dado[] = new int[10];
		int face[] = { 0, 0, 0, 0, 0, 0 };
		int i;

		for(i = 0; i < dado.length; i++)
		{
			dado[i] = r.nextInt(6)+1;
			face[dado[i]-1]++;
		}

		System.out.println();
		System.out.print("dado[]= ");
		for(i = 0; i < dado.length; i++)
			System.out.print(dado[i] + ", ");

		System.out.println();
		System.out.print("face[]= ");
		for(i = 0; i < face.length; i++)
			System.out.print(face[i] + ", ");
	}
}

