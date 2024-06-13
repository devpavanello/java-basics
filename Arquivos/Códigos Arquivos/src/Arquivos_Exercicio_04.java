import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Arquivos_Exercicio_04 
{

	public static void main(String[] args) 
	{
		File arquivo = new File("C:\\TEMP\\temp.txt");
		long tamanho, atualizacao;
		
		tamanho = arquivo.length();
		System.out.println("<fiap.txt> tamanho: " + tamanho + "bytes");
		
		atualizacao = arquivo.lastModified();
		System.out.println("<fiap.txt> atual: " + atualizacao);
		Date data = new Date(atualizacao);
		System.out.println("<fiap.txt> atual: " + data);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("EEEE dd/mm/yyyy HH:mm:ss.SSSXXX");
		System.out.println("<fiap.txt> atual: " + dataFormatada.format(data));
	}

}
