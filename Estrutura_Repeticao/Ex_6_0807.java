package La�oRepeticao;
import java.util.Scanner;
public class Ex_6_0807 {
	public static void main (String args[])
	{
		/*6-	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(*/
		
	Scanner ler = new Scanner(System.in);
	int num,media,cont=0,soma3=0;
	
		do
		{
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
			
			if(num%3==0)
			{
				soma3 = soma3+num;
				cont++;
			}
		
		}while(num!=0);
			media=soma3/cont;
			System.out.println("A m�dia do valores que s�o m�ltiplos de 3: "+media);
	}
}
