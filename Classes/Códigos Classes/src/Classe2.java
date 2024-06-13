
public class Classe2 
{

	public static void main(String[] args) 
	{
		Classe1.valor=7;
		System.out.println("Classe1.valor= " + Classe1.valor);
		
		Classe1 c1 = new Classe1();
		c1.incrementaX();
        c1.incrementaY();
        
        Classe1 c2 = new Classe1();
		c2.incrementaX();
        c2.incrementaY();
        
        Classe1 c3 = new Classe1();
		c3.incrementaX();
        c3.incrementaY();
		

	}

}
