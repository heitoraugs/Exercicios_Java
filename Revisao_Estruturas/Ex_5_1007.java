package Revis�o;
import java.util.Scanner;
public class Ex_5_1007 {
	public static void main(String args[])
	{
		/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um c�digo inteiro. 
		 *Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		 *Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.*/
		
		Scanner ler = new Scanner(System.in);
		float [] vet =new float [5];
		int cod,x;
		
		for(x=0;x<vet.length;x++)
		{
			System.out.println("Entre com um valor para o vetor: ");
			vet [x] = ler.nextFloat();
		}
		
		System.out.println("Escolha uma a��o:\n0-Finalizar o programa\n1-Exibe o vetor\n2-Exibe o vetor em ordem inversa");
		cod = ler.nextInt();
		
		switch(cod)
		{
		case 0:
			System.out.println("Programa finalizado!");
			break;
		case 1:
			System.out.println("Exibi��o do vetor: ");
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
			System.out.println("C�digo inv�lido!");
		}
	}
}

