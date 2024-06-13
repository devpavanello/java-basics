import java.io.File;

public class Arquivos_Exercicio_05 
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\TEMP\\temp.txt");
		
		if(arquivo.exists())
			if(arquivo.delete())
				System.out.println("O arquivo " + arquivo + "excluido com SUCESSO!");
			else
				System.out.println("O arquivo "+ arquivo + " não foi excluido!");
		else
			System.out.println("O arquivo "+ arquivo + " não existe!");
	}

}
