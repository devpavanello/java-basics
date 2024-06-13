
public class Vetores_Exercicio_CEF {

	public static void main(String[] args) {

		// Comentarios
		// Indice sempre inicia no 0. Exemplo 10 (0...9)
		// Lembrar de ler atentamente o enunciado e inicializar as variais com os
		// valores corretos.
		// Lembrar de contar o digito verificador no vetor.
		// Sempre quando quero acessar o ultimo numero do vetor, colocar length -1 ou 16
		// - 1(Numero de componentes do vetor.
		int CEF[] = { 2, 0, 0, 4, 0, 0, 1, 0, 0, 0, 0, 0, 4, 4, 8, 6 };
		int i, soma, peso, DVi, DVc;

		DVi = CEF[CEF.length - 1];

		soma = 0;
		peso = 8;

		for (i = 0; i < CEF.length - 1; i++) {
			soma = soma + peso * CEF[i];
			peso--;
			if (peso == 1)
				peso = 9;
		}

		soma = 10 * soma;
		DVc = soma % 11;
		if (DVc == 10)
			DVc = 0;

		if (DVc == DVi)
			System.out.println("CEF VÁLIDA!");
		else
			System.out.println("CEF INVÁLIDA!");

	}

}
