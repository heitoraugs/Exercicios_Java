package Logica;
import java.util.Scanner;
public class Ex_4_0607 {
	
	public static void main (String args[])
	{
		/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		 * D=(R+S)2
		 * R=(A+B)^2
		 * S=(B+C)^2*/
		
		Scanner leitura = new Scanner (System.in);
		int a,b,c;
		double d,r,s;
		
		System.out.printf("Insira o n�mero A: ");
		a = leitura.nextInt();
		System.out.printf("Insira o n�mero B: ");
		b = leitura.nextInt();
		System.out.printf("Insira o n�mero C: ");
		c = leitura.nextInt();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		System.out.printf("O resultado �: "+ d);
		
		
	}
}
