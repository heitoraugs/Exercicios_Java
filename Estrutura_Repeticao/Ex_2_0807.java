package La�oRepeticao;
import java.util.Scanner;
public class Ex_2_0807 {
	public static void main (String args[])
	{
		/*2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */
		
		Scanner ler = new Scanner(System.in);
		int num,somapar=0,somaimpar=0,cont;
		
		for(cont=1;cont<=10;cont++)
		{
			System.out.println("Entre com um n�mero: ");
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
		System.out.printf("Total de n�meros pares: %d \n",somapar);
		System.out.printf("Total de n�meros pares: %d \n",somaimpar);
	}
}
