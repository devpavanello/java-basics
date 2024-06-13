import java.io.File; 
//Para trabalharmos com arquivos, precisamos importar o io.File

public class Arquivos_Exercicio_01
{

	public static void main(String[] args)
	{
		//Este é o caminho onde o arquivo está localizado. 
		File arquivo = new File("C:\\temp\\temp.txt");
		File diretorio = new File("C:\\temp");

		if (arquivo.exists()) {
			System.out.println("O arquivo temp.txt existe fisicamente.");

			if (arquivo.canRead())
				System.out.println("O arquivo temp.txt pode ser lido.");
			else
				System.out.println("O arquivo temp.txt NÃO pode ser lido.");

			if (arquivo.canWrite())
				System.out.println("O arquivo temp.txt pode ser escrito.");
			else
				System.out.println("O arquivo temp.txt NÃO pode ser escrito.");

			if (arquivo.canExecute())
				System.out.println("O arquivo temp.txt pode ser executado.");
			else
				System.out.println("O arquivo temp.txt NÃO pode ser executado.");
		} else {
			System.out.println("O arquivo temp.txt NÃO existe fisicamente.");

			if (diretorio.isDirectory())
				System.out.println("Diretorio faz referencia a um diretorio.");
			else
				System.out.println("Diretorio NÃO faz referencia a um diretorio.");

		}

	}

}
