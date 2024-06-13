import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Arquivos_Exercicio_08
{
	

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\temp\\arq_byte.bin");
		
		try
		{
			OutputStream os = new FileOutputStream(arquivo);
			byte[] b = {50,51,53};
			String str = "arquivos binarios";
			os.write(55);
			os.write(b);
			os.write(str.getBytes());
			os.flush();
			os.close();
		}
		catch(IOException e)
		{
			System.out.println("Erro de I/O FileOutputStream()!");
			System.out.println("Mensagem: " + e.getMessage());
		}
		
		try
		{
			InputStream is = new FileInputStream(arquivo);
			int conteudo;
			while((conteudo = is.read()) != -1)
			{
				System.out.println(conteudo + "-" + ((char)(conteudo)));
			}
			is.close();
		}
		catch(IOException e)
		{
			System.out.println("Erro de I/O FileInputStream()!");
			System.out.println("Mensagem: " + e.getMessage());
		}

	}

}
