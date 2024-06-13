import java.io.File;

public class Arquivos_Exercicio_02 {

	public static void main(String[] args) {
		File diretorio = new File("C:\\FIAP\\fiap");

		if (diretorio.mkdirs())
			System.out.println("pasta <C:\\FIAP\\fiap> criada com sucesso!");
		else
			System.out.println("Erro ao criar a pasta <C:\\FIAP\\fiap");
	}
}
