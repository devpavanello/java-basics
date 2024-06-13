import java.util.Scanner;
public class Estrutura_de_Repeticao_Exercicio_03 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;
		boolean sair = false;
		
		do
		{
			System.out.println("Digite (1) para exibir Pi");
			System.out.println("Digite (2) para exibir e");
			System.out.println("Digite (3) para sair.");
			System.out.println("Informe a opção desejada: ");
			opcao = teclado.nextInt();
			
			switch(opcao)
			{
			case 1: 
				System.out.println("Pi = " + Math.PI);
				break;
				
			case 2: 
				System.out.println("E = " + Math.E);
				break;
			case 3: 
				System.out.println("Fim da execução!");
				break;
				
			default:
			         System.out.println("Opção Inválida!");
			}
		}while(sair == false);
		
		teclado.close();

	}
}
