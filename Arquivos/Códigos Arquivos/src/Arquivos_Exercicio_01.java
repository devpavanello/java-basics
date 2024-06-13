import java.io.File; 
//Para trabalharmos com arquivos, precisamos importar o io.File

public class Arquivos_Exercicio_01
{

	public static void main(String[] args)
	{
		//Este � o caminho onde o arquivo est� localizado. 
		File arquivo = new File("C:\\temp\\temp.txt");
		File diretorio = new File("C:\\temp");

		if (arquivo.exists()) {
			System.out.println("O arquivo temp.txt existe fisicamente.");

			if (arquivo.canRead())
				System.out.println("O arquivo temp.txt pode ser lido.");
			else
				System.out.println("O arquivo temp.txt N�O pode ser lido.");

			if (arquivo.canWrite())
				System.out.println("O arquivo temp.txt pode ser escrito.");
			else
				System.out.println("O arquivo temp.txt N�O pode ser escrito.");

			if (arquivo.canExecute())
				System.out.println("O arquivo temp.txt pode ser executado.");
			else
				System.out.println("O arquivo temp.txt N�O pode ser executado.");
		} else {
			System.out.println("O arquivo temp.txt N�O existe fisicamente.");

			if (diretorio.isDirectory())
				System.out.println("Diretorio faz referencia a um diretorio.");
			else
				System.out.println("Diretorio N�O faz referencia a um diretorio.");

		}

	}

}
