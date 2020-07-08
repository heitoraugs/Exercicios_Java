package LaçoRepeticao;
import java.util.Scanner;
public class Ex_4_0807 {
	public static void main (String args[])
	{
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		•	o número de pessoas calmas; 
		•	o número de mulheres nervosas; 
		•	o número de homens agressivos; 
		•	o número de pessoas nervosas com mais de 40 anos; 
		•	o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner ler = new Scanner(System.in);
		int idade, gen,psi,cont=0,totalPcalm=0,totalFnerv=0,totalMagre=0,totalP40=0,totalP18=0;
		
		while(cont<=150)
		{
			System.out.println("informe a sua idade: ");
			idade = ler.nextInt();
			System.out.println("informe o seu gênero: |1 - Feminino|  |2 - Masculino| ");
			gen = ler.nextInt();
			System.out.println("informe o sua característica psicológica: |1 - Calmo(a)|  |2 - Nervoso(a)|  |3 - Agressivo(a)| ");
			psi = ler.nextInt();
			
			if(psi==1) //nº de pessoas calmas
			{
				totalPcalm++;
				cont++;
			}
			if(gen==1 && psi==2)//nº de mulheres nervosas
			{
				totalFnerv++;
				cont++;
			}
			if(gen==2 && psi==3)//nº de homens agressivos
			{
				totalMagre++;
				cont++;
			}
			if(psi==2 && idade>=40)//nº de pessoas nervosas com mais de 40 anos
			{
				totalP40++;
				cont++;
			}
			if(psi==1 && idade<=18)//nº de pessoas calmas com menos de 18 anos
			{
				totalP18++;
				cont++;
			}
			
		}
		System.out.println("Total de pessoas calmas: "+totalPcalm);
		System.out.println("Total de mulheres nervosa: "+totalFnerv);
		System.out.println("Total de homens agressivos: "+totalMagre);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: "+totalP40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: "+totalP18);
	}
}
