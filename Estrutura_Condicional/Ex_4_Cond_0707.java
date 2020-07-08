package LacoCondicional;
import java.util.Scanner;
public class Ex_4_Cond_0707 {
public static void main (String args[]) {
	
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
	 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
	
	Scanner ler = new Scanner(System.in);
	int num;
	System.out.println("Informe um número: ");
	num = ler.nextInt();
	
	if(num%2==0)
		{
			System.out.println("O número informado é par e a sua raiz quadrada é: "+Math.sqrt(num));
		}
	else
		{
			System.out.println("O número informado é impar e elevado ao quadrado é: "+Math.pow(num,2));
		}
		
	}
}
