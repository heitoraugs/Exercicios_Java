package Logica;
import java.util.Scanner;
public class Ex_5_0607 
{
	
	public static void main (String args[]) {
		
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * 'Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */
		
		Scanner ler = new Scanner (System.in);
		float n1,n2,n3;
		double peso1,peso2,media;
		System.out.printf("Insira a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.printf("Insira a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.printf("Insira a terceira nota: ");
		n3 = ler.nextFloat();
		
		peso1 = (n1*2.3);
		peso2 = n2*5;
		media = (peso1+peso2+n3)/(2.3+5);
		
		System.out.printf("A m�dia do aluno �: "  + Math.ceil(media));
		
		
	}
	
	

}
