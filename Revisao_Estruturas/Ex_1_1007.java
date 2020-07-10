package Revisão;
import java.util.Scanner;
public class Ex_1_1007 {
	public static void main (String args[])
	{
		/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		float valor,desc1,desc2,parc3,jur4,parc4;
		
		System.out.println("Informe o valor do produto: ");
		valor = ler.nextFloat();
		System.out.println("Escolha forma de pagamento:\n1-À vista em dinheiro ou cheque, recebe 20% de desconto\n2-À vista no cartão de crédito, recebe 15% de desconto\n3-Em duas vezes, preço normal de etiqueta sem juros\n4-Em três vezes, preço normal de etiqueta mais juros de 10% ");
		opcao = ler.nextInt();
		
		switch(opcao)
		{
		case 1:
			desc1=(valor*20)/100;
			System.out.println("O preço do produto à vista em dinheiro ou cheque, aplicado 20% de desconto: "+(valor-desc1));
			break;
		case 2:
			desc2=(valor*15)/100;
			System.out.println("O preço do produto à vista no cartão de crédito, aplicado 15% de desconto: "+(valor-desc2));
			break;
		case 3:
			parc3=valor/2;
			System.out.println("O preço do produto, dividido em duas vezes, sem juros aplicado: "+parc3+"\nCom um total de: "+valor);
			break;
		case 4:
			jur4=(valor*10)/100;
			parc4=(jur4+valor)/3;
			System.out.println("O preço do produto, dividido em três vezes, com juros de 10% aplicado: "+parc4+"\nCom um total de: "+(valor+jur4));
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
