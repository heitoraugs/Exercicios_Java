package Array;

public class Ex_1_0907 {
	
	public static void main (String args[])
	{
		/*Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		int soma,cont,i=0;
		
		int [] vetorA;
		vetorA = new int[6];
		vetorA [0]=1; //(a)
		vetorA [1]=0;
		vetorA [2]=5;
		vetorA [3]=-2;
		vetorA [4]=-5;
		vetorA [5]=7;
		
		soma= vetorA[0]+vetorA[1]+vetorA[5];//(b)
		System.out.println("A soma dos valores: "+soma);
		
		if(vetorA[4]!=100)//(c)
		{
			vetorA[4] = 100;
			System.out.println("Novo valor da posi��o 4: " +vetorA[4]);
		}
		
		for(i=0;i<vetorA.length;i++)//(d)
		{
			System.out.println("O n�mero na posi��o "+(i+1)+": "+vetorA[i]);
		}
	}

}
