package POO;

public class Ex_3_1307_ProdutoEletro {
	public static void main (String args[])
	{
		/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, 
		 *defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
		ProdutoEletro produto = new ProdutoEletro("Computador",2.500,5);
		System.out.println(produto.getDadosProduto());
	}

}
