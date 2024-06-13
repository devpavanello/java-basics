
public class Vetores_Exercicio_ITAU {

	public static void main(String[] args) {

		// Vetor
		int ITAU[] = { 2, 5, 4, 5, 0, 2, 3, 6, 6, 1 };

		// Variaveis
		// i - �ndice
		// soma - Soma de todos os n�meros
		// mult - Para fazer a excess�o do n�mero que for maior que 9.
		// resto - O resto de mod de 10
		// peso - peso indicado pelo enunciado
		// DVi - Digito verificador informado
		// DVc - Digito verificador calculado
		int i, soma, mult, resto, peso, DVi, DVc;

		// Pegar o digito verificador digitado pelo cliente e fazer menos 1 para ele
		// pegar todos os numeros do vetor.
		DVi = ITAU[ITAU.length - 1];
		// Soma sempre inicia zerada
		soma = 0;
		// O peso ele � igual a 2. Essa informa��o ela � informada pelo enunciado. O
		// peso � igual a dois pois ele inicia em 2,1,2,1...
		peso = 2;

		// Meu indice ele inicia zerado. Depois ele deve ser menor que meu vetor. E no
		// final ele sofre um incremento (i = i + 1)
		for (i = 0; i < ITAU.length - 1; i++) {
			// 1) Multiplicamos o numero da agencia por 2(impar) e 1(par)
			mult = ITAU[i] * peso;
			// 2) Condi��o que se o resultado da multiplica��o for maior que 9, ele ir�
			// somar os dois digitos do n�mero.
			if (mult > 9)
				mult = mult - 9;
			// 3) Soma de todos os valores obtidos.
			soma = soma + mult;

			// Peso necessita sofrer um decremnto, mas precisamos colocar a condi��o nele
			// que se ele chegar a 0, ele voltaria para 2.
			peso--;
			if (peso == 0)
				peso = 2;
		}
		// 4) Obter o m�dulo de 10 da soma.
		resto = soma % 10;

		// 5) Caso o valor obtido no item (4) seja maior que 0, o d�gito verificador � o
		// resultado da subtra��o 10 - (valor obtido no item (4)); caso o valor obtido
		// no item (4)seja igual a 0, divis�o exata, o d�gito verificador � 0.
		if (resto > 0)
			DVc = 10 - resto;
		else
			DVc = 0;

		if (DVi == DVc)
			System.out.println("ITA� V�LIDA!");
		else
			System.out.println("ITA� INV�LIDA!");

	}

}
