package Array;
import java.util.Scanner;
public class Ex_3_0907 {
	public static void main (String args[])
	{
		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		Scanner ler = new Scanner(System.in);
		int[][] m1 = new int [3][3];
		int x=0,i,j,cont10=0;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Defina valores para a matriz:");
				m1[i][j]= ler.nextInt();
				x++;
				if(m1[i][j]>10)
				{
					cont10++;
				}
			}
		}
		System.out.printf("Total de valores maiores que 10: %d", cont10);
	}

}
