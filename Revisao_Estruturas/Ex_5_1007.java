package Revisão;
import java.util.Scanner;
public class Ex_5_1007 {
	public static void main(String args[])
	{
		/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
		 *Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		 *Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/
		
		Scanner ler = new Scanner(System.in);
		float [] vet =new float [5];
		int cod,x;
		
		for(x=0;x<vet.length;x++)
		{
			System.out.println("Entre com um valor para o vetor: ");
			vet [x] = ler.nextFloat();
		}
		
		System.out.println("Escolha uma ação:\n0-Finalizar o programa\n1-Exibe o vetor\n2-Exibe o vetor em ordem inversa");
		cod = ler.nextInt();
		
		switch(cod)
		{
		case 0:
			System.out.println("Programa finalizado!");
			break;
		case 1:
			System.out.println("Exibição do vetor: ");
			for(x=0;x<vet.length;x++)
			{	
				System.out.printf("Vetor["+x+"] = "+vet[x]+"\t");
			}
			break;
		case 2:
			for(x=vet.length-1;x>=0;x--)
			{
				System.out.printf("Vetor["+x+"] = "+vet[x]+"\t");
			}
			break;
		default:
			System.out.println("Código inválido!");
		}
	}
}

