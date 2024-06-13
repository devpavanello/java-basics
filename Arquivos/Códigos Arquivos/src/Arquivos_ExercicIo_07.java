import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Arquivos_Exercico_07
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String frase = new String();
		int caracter;
		
		System.out.println("Digite uma frase: ");
		frase = teclado.nextLine();
		
		try
		{
			File arquivoW = new File("C:\\TEMP\\arq_char.txt");
			FileWriter escritor = new FileWriter(arquivoW, true); 
			escritor.write(frase);
			escritor.flush();
			escritor.close();
		}
		catch(IOException eW)
		{
			System.out.println("EXCEÇÃO na operação de escrita");
			System.out.println("Mensagem: " + eW.getMessage());
		}
		
		try
		{
			File arquivoR = new File("C:\\TEMP\\arq_char.txt");
			FileReader leitor = new FileReader(arquivoR);
			
			System.out.println("arq_char.txt");
			caracter = leitor.read();
			//Fim de arquivo: EOF = -1
			while(caracter != -1)
			{
				System.out.println((char)caracter);
				caracter = leitor.read();
			}
			leitor.close();
		}
		catch(IOException eR)
		{
			System.out.println("EXCEÇÃO na operação de escrita");
			System.out.println("Mensagem: " + eR.getMessage());
		}
		
		teclado.close();

	}

}
