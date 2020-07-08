package Logica;
import java.util.Scanner;
public class Ex_6_0607
{
	
	public static void main (String args[]) {
		
		/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		 *A fórmula que efetua tal cálculo é:
		 *d=raiz{(x2-x1)^2 + (y2-y1)^2} */
		
		Scanner ler = new Scanner (System.in);
		float x1,x2,y1,y2,d;
		System.out.printf("Insira o valor de X1: ");
		x1 = ler.nextFloat();
		System.out.printf("Insira o valor de Y1: ");
		y1 = ler.nextFloat();
		System.out.printf("Insira o valor de X2: ");
		x2 = ler.nextFloat();
		System.out.printf("Insira o valor de Y2: ");
		y2 = ler.nextFloat();
		
		d = (float) Math.sqrt(Math.pow(x1-y1,2)+(Math.pow(x2-y2,2)));
		
		System.out.printf("O resultado é: "+ d);
	}

}
