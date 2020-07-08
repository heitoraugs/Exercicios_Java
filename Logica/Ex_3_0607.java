package Logica;
import java.util.Scanner;
public class Ex_3_0607 {
	
	public static void main (String args[]) 
	{
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
		
		Scanner leitura = new Scanner(System.in);
		float duracao;
		int hora,minuto;
		
		System.out.print("Informe a duração do evento, em segundos: ");
		duracao = leitura.nextFloat();
		
		hora = (int) (duracao/3600);
		minuto = (int) (duracao/60);
		
		System.out.printf("A duração do evento, em horas: "+hora);
		System.out.printf("\nA duração do evento, em minutos: "+minuto);
		System.out.printf("\nA duração do evento, em segundos: "+duracao);
		
		
	}
	
	

}
