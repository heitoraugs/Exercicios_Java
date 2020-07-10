package Revisão;
import java.util.Scanner;
public class Ex_6_1007 {
	public static void main (String args[])
	{
		/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
		 *Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.*/
		
		Scanner ler =new Scanner(System.in);
		int [] vet = new int [3];
		int [][] mat = new int [3][3];
		int x,i,j=0,multi;
		
		for(x=0;x<vet.length;x++) {
			System.out.println("Entre com um valor para o vetor: ");
			vet[x]=ler.nextInt();}
		
		for(i=0;i<mat.length;i++)
			for(j=0;j<mat.length;j++){
				System.out.println("Entre com um valor para a matriz: ");
				mat[i][j]=ler.nextInt();}

		mat[0][0]= mat[0][0]*vet[0];
		mat[0][1]= mat[0][1]*vet[1];
		mat[0][2]= mat[0][2]*vet[2];
		mat[1][0]= mat[1][0]*vet[0];
		mat[1][1]= mat[1][1]*vet[1];
		mat[1][2]= mat[1][2]*vet[2];
		mat[2][0]= mat[2][0]*vet[0];
		mat[2][1]= mat[2][1]*vet[1];
		mat[2][2]= mat[2][2]*vet[2];

		System.out.println("Valores multiplicados: ");
		for(i=0;i<mat.length;i++)
			for(j=0;j<mat.length;j++)
				System.out.println("Vetor["+i+"]"+"["+j+"]= "+ mat[i][j]+"\t");	
	}
}
