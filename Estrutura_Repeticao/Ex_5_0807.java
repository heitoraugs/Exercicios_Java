package La�oRepeticao;
import java.util.Scanner;
public class Ex_5_0807 {
	public static void main (String args[])
	{
		/*5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 *  No final, mostre a soma dos n�meros digitados*/
		
		Scanner ler = new Scanner (System.in);
		int num,somanum=0;
		
		do
		{
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
			somanum = somanum + num;
			
		}while (num!=0);
			
		System.out.println("O total de n�meros foi: "+somanum);
	}

}
