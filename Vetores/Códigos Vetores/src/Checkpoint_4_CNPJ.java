
public class Checkpoint_4_CNPJ
{

	public static void main(String[] args)
	{
		int CNPJ[] = {6,0,8,7,2,5,0,4,0,0,0,1,2,3};
		int i, peso, soma, resto, DVi1, DVc1, DVi2, DVc2;
		
		DVi1 = CNPJ[CNPJ.length-2];
		DVi2 = CNPJ[CNPJ.length-1];
		
		//Cálculo do primeiro digito verificador
		soma=0;
		peso=5;
		for(i=0; i<CNPJ.length-2; i++) 
		{
			soma = soma + peso * CNPJ[i];
			peso--;
			if(peso < 2)
				peso=9;
		}
		
		resto = soma % 11;
		if(resto < 2)
			DVc1=0;
		else
			DVc1 = 11 - resto;

		//Cálculo do segundo digito verificador
		soma=0;
		peso=6;
		for(i=0; i < CNPJ.length-1; i++) 
		{
			soma = CNPJ[i] * peso + soma;
			peso--;
			if(peso < 2)
				peso=9;
		}
		
		resto = soma % 11;
		if(resto < 2)
			DVc2 = 0;
		else
			DVc2 = 11 - resto;
		
		if((DVi1 == DVc1) && (DVi2 == DVc2))
			System.out.println("CNPJ VÁLIDO!");
		else
			System.out.println("CNPJ INVÁLIDO!");
		
	}
}
