package Logica;
import java.util.Scanner;
public class Ex_1_0607 {
	public static void main(String args[])
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias*/
		
		Scanner leitura = new Scanner (System.in);
		int ano,mes,dia,totaldias;
		
		System.out.printf("Insira sua quantidade de ano(s): ");
		ano = leitura.nextInt();
		System.out.printf("Insira sua quantidade de mês(es): ");
		mes = leitura.nextInt();
		System.out.printf("Insira sua quantidade de dia(s): ");
		dia = leitura.nextInt();
		
		totaldias = ano*365+mes*30+dia;
		
		System.out.printf("\n O seu total de dias de vida é %d",totaldias);
	}
}
