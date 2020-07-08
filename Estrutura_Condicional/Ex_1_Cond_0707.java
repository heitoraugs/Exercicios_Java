package LacoCondicional;
import java.util.Scanner;
public class Ex_1_Cond_0707 {
	
	public static void main (String args[]) {
		
		/*1-	Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
	Scanner ler = new Scanner (System.in);
	int num1,num2,num3,maiornum=0;
	
	System.out.println("Informe o primeiro número: ");
	num1 = ler.nextInt();
	System.out.println("Informe o segundo número: ");
	num2 = ler.nextInt();
	System.out.println("Informe o terceiro número: ");
	num3 = ler.nextInt();
	
	if(maiornum<num1)
		{
			maiornum=num1;
		}
	if(maiornum<num2)
		{
			maiornum=num2;
		}
	if (maiornum<num3)
		{
			maiornum=num3;
		}
	System.out.println("O maior número é: "+maiornum);
		
	}
}
