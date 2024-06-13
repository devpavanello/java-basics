
public class Vetores_Exercicio_ITAU {

	public static void main(String[] args) {

		// Vetor
		int ITAU[] = { 2, 5, 4, 5, 0, 2, 3, 6, 6, 1 };

		// Variaveis
		// i - Índice
		// soma - Soma de todos os números
		// mult - Para fazer a excessão do número que for maior que 9.
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
		// O peso ele é igual a 2. Essa informação ela é informada pelo enunciado. O
		// peso é igual a dois pois ele inicia em 2,1,2,1...
		peso = 2;

		// Meu indice ele inicia zerado. Depois ele deve ser menor que meu vetor. E no
		// final ele sofre um incremento (i = i + 1)
		for (i = 0; i < ITAU.length - 1; i++) {
			// 1) Multiplicamos o numero da agencia por 2(impar) e 1(par)
			mult = ITAU[i] * peso;
			// 2) Condição que se o resultado da multiplicação for maior que 9, ele irá
			// somar os dois digitos do número.
			if (mult > 9)
				mult = mult - 9;
			// 3) Soma de todos os valores obtidos.
			soma = soma + mult;

			// Peso necessita sofrer um decremnto, mas precisamos colocar a condição nele
			// que se ele chegar a 0, ele voltaria para 2.
			peso--;
			if (peso == 0)
				peso = 2;
		}
		// 4) Obter o módulo de 10 da soma.
		resto = soma % 10;

		// 5) Caso o valor obtido no item (4) seja maior que 0, o dígito verificador é o
		// resultado da subtração 10 - (valor obtido no item (4)); caso o valor obtido
		// no item (4)seja igual a 0, divisão exata, o dígito verificador é 0.
		if (resto > 0)
			DVc = 10 - resto;
		else
			DVc = 0;

		if (DVi == DVc)
			System.out.println("ITAÚ VÁLIDA!");
		else
			System.out.println("ITAÚ INVÁLIDA!");

	}

}
