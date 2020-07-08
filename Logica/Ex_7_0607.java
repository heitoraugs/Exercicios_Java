package Logica;
import java.util.Scanner;
public class Ex_7_0607 
{
	public static void main (String args[]) 
	{
		/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y
		 * x=(ce-bf)/(ae-bd)
		 * y=(af-cd)/ae-bd)*/
		
		Scanner ler = new Scanner (System.in);
		int a,b,c,d,e,f,x,y;
		
		System.out.printf("Insira o valor de A: ");
		a = ler.nextInt();
		System.out.printf("Insira o valor de B: ");
		b = ler.nextInt();
		System.out.printf("Insira o valor de C: ");
		c = ler.nextInt();
		System.out.printf("Insira o valor de D: ");
		d = ler.nextInt();
		System.out.printf("Insira o valor de E: ");
		e = ler.nextInt();
		System.out.printf("Insira o valor de F: ");
		f = ler.nextInt();
		
	
		x= ((c*e) - (b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O valor de X é: "+x);
		System.out.printf("O valor de Y é: "+y);
	}
}
