import java.util.Scanner;



public class Strings_Exercicio_DecimalRomano
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int decimal[] = {  1000,  900, 500,  400, 100,  90,  50,   40,  10,    9,   5,    4,   1 };
        String romano[] = { "M", "CM", "D", "CD", "C","XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int dec, num, i;
        String rom = "";



       System.out.print("Digite um n�mero inteiro (de 1 a 1.000): ");
        dec = teclado.nextInt();
        num = dec;



       for (i = 0; i < decimal.length; i++)
            while (decimal[i] <= dec)
            {
                rom = rom + romano[i];
                dec = dec - decimal[i];
            }



       System.out.print("\n" + num + " em decimal equivale a " + rom + " em algarismos romanos");
        teclado.close();
    }
}
