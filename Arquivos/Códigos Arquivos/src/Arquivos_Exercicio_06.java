import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Arquivos_Exercicio_06
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String frase = new String();



       System.out.print("Digite uma frase: ");
        frase = teclado.nextLine().toLowerCase();



       try
        {
            File arquivo = new File("C:\\TEMP\\frase.txt");
            FileWriter escritor = new FileWriter(arquivo, true);
            escritor.write(frase);
            escritor.close();
        }
        catch (IOException e)
        {
            System.out.println("EXCE��O na opera��o de escrita");
            System.out.println("mensagem: " + e.getMessage());
        }



       teclado.close();
    }
}
