package POO;

public class Ex_3_1307_ProdutoEletro {
	public static void main (String args[])
	{
		/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
		 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		ProdutoEletro produto = new ProdutoEletro("Computador",2.500,5);
		System.out.println(produto.getDadosProduto());
	}

}
