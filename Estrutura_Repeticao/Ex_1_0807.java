package La�oRepeticao;
import java.util.Scanner;
public class Ex_1_0807 {
	public static void main (String args[])
	{
		/*1-	Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5*/
		
		int num,total=0;
		
		for(num=1000;num<=1999;num++)
		{
			if(num%11==5)
			{
				System.out.println("N�mero que quando divido por 11, tem como resto 5: "+num);
				total++;
				num++;
			}
		}
		System.out.println("Total de n�meros %11==5: "+total);
	}
}
