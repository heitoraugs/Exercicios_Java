package Revisão;
import java.util.Scanner;
public class Ex_4_1007 {
	public static void main(String args[])
	{
		/*Faça um programa em Java que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/
		
		float dividendo=1, divisor=1,divisao=0,soma=0;
		
		while(dividendo<=99 && divisor<=50)
		{
			System.out.println(dividendo+" / "+divisor+" = "+divisao);
			divisao=dividendo/divisor;
			soma=soma+divisao;
			dividendo=dividendo+2;
			divisor++;
		}
		System.out.println("Soma: "+soma);
	}

}
