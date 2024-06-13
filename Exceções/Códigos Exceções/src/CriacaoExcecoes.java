
public class CriacaoExcecoes
{
	public static void main(String[] args) throws SemLetraXException
	{
	    String frase = "Isso é um teste.";
	    System.out.println(frase);
	    if(!frase.contains("x") && !frase.contains("X"))
	    	throw new SemLetraXException();
	}
}
