package Logica;
import java.util.Scanner;
public class Ex_5_0607 
{
	
	public static void main (String args[]) {
		
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * 'Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
		
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
		
		System.out.printf("A média do aluno é: "  + Math.ceil(media));
		
		
	}
	
	

}
