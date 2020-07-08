package LaçoRepeticao;
import java.util.Scanner;
public class Ex_2_0807 {
	public static void main (String args[])
	{
		/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. */
		
		Scanner ler = new Scanner(System.in);
		int num,somapar=0,somaimpar=0,cont;
		
		for(cont=1;cont<=10;cont++)
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if(num%2==1)
			{
				somaimpar++;
			}
			else
			{
				somapar++;
			}
		}
		System.out.printf("Total de números pares: %d \n",somapar);
		System.out.printf("Total de números pares: %d \n",somaimpar);
	}
}
