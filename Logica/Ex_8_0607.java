package Logica;
import java.util.Scanner;
public class Ex_8_0607 {
	public static void main (String args[])
	{
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. */
		
	Scanner ler = new Scanner(System.in);
	float valorfab,porcdistr,porcimpost,custocons;
	
	System.out.printf("Insira o valor de f�brica do carro: ");
	valorfab = ler.nextFloat();
	
	porcdistr = (valorfab*28)/100;
	porcimpost =(valorfab*45)/100;
	custocons = porcdistr + porcimpost + valorfab;
	
	System.out.printf("O valor do carro para o consumidor, ser�: "+ custocons);
	
	}
}
