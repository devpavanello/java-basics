import java.io.File;

public class Arquivos_Exercicio_03 {

	public static void main(String[] args) {
		File arquivo = new File("C:\\FIAP\\fiap.txt");
		File destinatario = new File("C:\\temp\\fiap.txt");

		if (arquivo.renameTo(destinatario))
			System.out.println("Arquivo movido com Sucesso!");
		else
			System.out.println("Arquivo não foi movido com sucesso!");

	}
}
