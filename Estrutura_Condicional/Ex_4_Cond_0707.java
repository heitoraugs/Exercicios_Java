package LacoCondicional;
import java.util.Scanner;
public class Ex_4_Cond_0707 {
public static void main (String args[]) {
	
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
	 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
	
	Scanner ler = new Scanner(System.in);
	int num;
	System.out.println("Informe um n�mero: ");
	num = ler.nextInt();
	
	if(num%2==0)
		{
			System.out.println("O n�mero informado � par e a sua raiz quadrada �: "+Math.sqrt(num));
		}
	else
		{
			System.out.println("O n�mero informado � impar e elevado ao quadrado �: "+Math.pow(num,2));
		}
		
	}
}
