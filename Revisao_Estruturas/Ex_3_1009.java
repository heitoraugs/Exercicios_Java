package Revis�o;
import java.util.Scanner;
public class Ex_3_1009 {
	public static void main (String args[])
	{
		/*Escrever um programa que leia uma quantidade desconhecida de n�meros e conte quantos deles est�o nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for lido um n�mero negativo.*/
		Scanner ler = new Scanner(System.in);
		int num,x=0,cont0=0,cont26=0,cont51=0,cont76=0;
		
		do {
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
			if(num>=0 && num<=25)
			{
				cont0++;
			}
			if(num>=26 && num<=50)
			{
				cont26++;
			}
			if(num>=51 && num<=75)
			{
				cont51++;
			}
			if(num>=76 && num<=100)
			{
				cont76++;
			}
			
		}while(num>=0);
		
		System.out.println("Total de n�mero entre 0 e 25: "+cont0);
		System.out.println("Total de n�mero entre 26 e 50: "+cont26);
		System.out.println("Total de n�mero entre 51 e 75: "+cont51);
		System.out.println("Total de n�mero entre 76 e 100: "+cont76);
	}
}
