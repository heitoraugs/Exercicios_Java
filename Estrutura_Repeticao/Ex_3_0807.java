package LaçoRepeticao;
import java.util.Scanner;
public class Ex_3_0807 
{
	public static void main (String args[])
	{
		/*3-	Solicitar a idade de várias pessoas
		 e imprimir: Total de pessoas com menos de
		 21 anos. Total de pessoas com mais de 50 
		 anos. O programa termina quando idade for =-99. */
		Scanner ler = new Scanner(System.in);
		int idade,cont,total21=0, total50=0;
		
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		while(idade>-99)
		{
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			if(idade<=21)
			{
				total21++;
			}
			if(idade>=50)
			{
				total50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+total21);
		System.out.println("Total de pessoas maiores de 50 anos: "+total50);
	}
}
