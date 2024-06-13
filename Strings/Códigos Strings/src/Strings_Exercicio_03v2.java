
public class Strings_Exercicio_03v2
{

	public static void main(String[] args) 
	{
		// Iniciou assim pois a minha frase tem o valor atribuido no inicio.
				// Nessa versão nós adicionamos um espaço em branco no final para ele
				// conseguir fazer a varredura completa da frase.
				String frase = new String("EU ESTUDO NA FIAP ");
				// Minha frase 2x ela recebe um espaço em branco para conseguir fazer a
				// repetição
				String frase2x = "";
				// i e p são para fazer a varredura da minha string
				int i, p, tamanho;

				// Processamento
				tamanho = frase.length();
				p = 0;

				// Estrutura de repetição
				// Usamos tamanho pois a nossa string frase ele é constante. Poderiamos
				// usar frase.length() mas isso usa muita memória.
				for (i = 0; i < tamanho; i++) {
					// Essa estrutura de repetição faz a varredura até o espaço em
					// branco.
					if (frase.charAt(i) == ' ') {
						// Então quando chega no espaço em branco ele retira até onde
						// foi feita a varredura e replica a mesma ação
						// EU EU ESTUDO ESTUDO NA NA
						frase2x = frase2x + frase.substring(p, i + 1) + frase.substring(p, i + 1);
						// p recebe i + 1 pois ele passa para a proxima palavra da minha
						// string.
						p = i + 1;
					}
				}

				// Fora da minha estrutura de repetição a gente atribui essa condição
				// que o p ele vai ate o tamanho total da minha string e não somente ate
				// onde o i vai se não ele não aparece FIAP FIAP.
				// frase2x = frase2x + frase.substring(p, tamanho)+ " " +
				// frase.substring(p, tamanho);
				System.out.println("Frase = " + frase);
				// trim() ele retira o espaço em branco no começo e no final.
				System.out.println("Frase 2X = " + frase2x.trim());

	}

}
