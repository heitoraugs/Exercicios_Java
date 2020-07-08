package Logica;
import java.util.Scanner;
public class Ex_2_0607 {
	
	public static void main (String args[]) 
	{ 
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
	
		int ano,mes,dia,totaldias;
		String nome;
	
		Scanner leitura = new Scanner (System.in);
		System.out.printf("Insira o seu nome: ");
		nome = leitura.next();
		System.out.printf("Insira o total de dias que você viveu: ");
		totaldias = leitura.nextInt();
		
		ano = totaldias/365;
		mes = (totaldias%365)/30;
		dia = (totaldias%365)%30;
		
		System.out.println(nome+" tem " + ano +" ano(s),"+ mes +" mes(es) e "+ dia +" dia(s) de vida!");
		System.out.printf("%d tem %d ano(s), %d mes(es) e %d dia(s) de vida!" ,nome,ano,mes,dia);
	}
}
