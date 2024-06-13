
public class Strings_Exercicio_03v2
{

	public static void main(String[] args) 
	{
		// Iniciou assim pois a minha frase tem o valor atribuido no inicio.
				// Nessa vers�o n�s adicionamos um espa�o em branco no final para ele
				// conseguir fazer a varredura completa da frase.
				String frase = new String("EU ESTUDO NA FIAP ");
				// Minha frase 2x ela recebe um espa�o em branco para conseguir fazer a
				// repeti��o
				String frase2x = "";
				// i e p s�o para fazer a varredura da minha string
				int i, p, tamanho;

				// Processamento
				tamanho = frase.length();
				p = 0;

				// Estrutura de repeti��o
				// Usamos tamanho pois a nossa string frase ele � constante. Poderiamos
				// usar frase.length() mas isso usa muita mem�ria.
				for (i = 0; i < tamanho; i++) {
					// Essa estrutura de repeti��o faz a varredura at� o espa�o em
					// branco.
					if (frase.charAt(i) == ' ') {
						// Ent�o quando chega no espa�o em branco ele retira at� onde
						// foi feita a varredura e replica a mesma a��o
						// EU EU ESTUDO ESTUDO NA NA
						frase2x = frase2x + frase.substring(p, i + 1) + frase.substring(p, i + 1);
						// p recebe i + 1 pois ele passa para a proxima palavra da minha
						// string.
						p = i + 1;
					}
				}

				// Fora da minha estrutura de repeti��o a gente atribui essa condi��o
				// que o p ele vai ate o tamanho total da minha string e n�o somente ate
				// onde o i vai se n�o ele n�o aparece FIAP FIAP.
				// frase2x = frase2x + frase.substring(p, tamanho)+ " " +
				// frase.substring(p, tamanho);
				System.out.println("Frase = " + frase);
				// trim() ele retira o espa�o em branco no come�o e no final.
				System.out.println("Frase 2X = " + frase2x.trim());

	}

}
