package Logica;
import java.util.Scanner;
public class Ex_3_0607 {
	
	public static void main (String args[]) 
	{
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
		
		Scanner leitura = new Scanner(System.in);
		float duracao;
		int hora,minuto;
		
		System.out.print("Informe a dura��o do evento, em segundos: ");
		duracao = leitura.nextFloat();
		
		hora = (int) (duracao/3600);
		minuto = (int) (duracao/60);
		
		System.out.printf("A dura��o do evento, em horas: "+hora);
		System.out.printf("\nA dura��o do evento, em minutos: "+minuto);
		System.out.printf("\nA dura��o do evento, em segundos: "+duracao);
		
		
	}
	
	

}
