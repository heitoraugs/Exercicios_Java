package LaçoRepeticao;
import java.util.Scanner;
public class Ex_5_0807 {
	public static void main (String args[])
	{
		/*5-Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 *  No final, mostre a soma dos números digitados*/
		
		Scanner ler = new Scanner (System.in);
		int num,somanum=0;
		
		do
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			somanum = somanum + num;
			
		}while (num!=0);
			
		System.out.println("O total de números foi: "+somanum);
	}

}
