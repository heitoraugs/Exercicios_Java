package Revis�o;
import java.util.Scanner;
public class Ex_2_1007{
	public static void main(String args[])
	{
		/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2 
			Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo: 
			IMC em adultos / Condi��o:
			Abaixo de 18,5 Abaixo do peso 
			Entre 18,5 e 25 = Peso normal 
			Entre 25 e 30 =  Acima do peso 
			Acima de 30 = Obeso*/
		
		Scanner ler =new Scanner(System.in);
		float peso,alt;
		double imc;
		
		System.out.println("Informe a sua altura: ");
		alt = ler.nextFloat();
		System.out.println("Informe o seu peso: ");
		peso = ler.nextFloat();
		
		imc=peso/(Math.pow(alt,2));
		
		if(imc<18.5)
		{
			System.out.println("Com base no c�lculo do IMC, voc� se enquada na condi��o: Abaixo do peso!");
		}
		if(imc>=18.5 && imc<=25.0)
		{
			System.out.println("Com base no c�lculo do IMC, voc� se enquada na condi��o: Peso normal!");
		}
		if(imc>25.0 && imc<=30.0)
		{
			System.out.println("Com base no c�lculo do IMC, voc� se enquada na condi��o: Acima do peso!");
		}
		if(imc>30.0)
		{
			System.out.println("Com base no c�lculo do IMC, voc� se enquada na condi��o: Obeso!");
		}
	}
} 

	

	

