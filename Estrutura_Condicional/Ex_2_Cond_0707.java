package LacoCondicional;
import java.util.Scanner;
public class Ex_2_Cond_0707 {

	public static void main (String args[])
	{
		/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
		
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3,maiornum=0;
		System.out.println("Informe o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		num3 = ler.nextInt();
		//testar qual � o maior n� e e ver qual � o maior entre os outros dois
		
		if(maiornum<num1)
			{
			maiornum=num1;
			}
		if(maiornum<num2)
			{
			maiornum=num2;
			}
		if(maiornum<num3)
			{
			maiornum=num3;
			}
		if(maiornum==num1 && num2<num3)
		{
			System.out.println("A sequ�ncia �: "+"\n"+num2+"\n"+num3+"\n"+num1);
		}
		else if(maiornum==num1 && num2>num3)
		{
			System.out.println("A sequ�ncia �: "+"\n"+num3+"\n"+num2+"\n"+num1);
		}
		else if(maiornum==num2 && num1<num3)
		{
			System.out.println("A sequ�ncia �: "+"\n"+num1+"\n"+num3+"\n"+num2);
		}
		else if(maiornum==num2 && num1>num3)
		{
			System.out.println("A sequ�ncia �: "+"\n"+num2+"\n"+num1+"\n"+num2);
		}
		else if(maiornum==num3 && num1<num2)
		{
			System.out.println("A sequ�ncia �: "+"\n"+num1+"\n"+num2+"\n"+num3);
		}
		else 
		{
			System.out.println("A sequ�ncia �: "+"\n"+num2+"\n"+num1+"\n"+num3);
		}
	}
}
