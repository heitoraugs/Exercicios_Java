package POO;

public class ProdutoEletro {
	private String Produto;
	private double Pre�o;
	private int UnidadesEmEstoque;
	
	public ProdutoEletro (String produto, double preco,int uniEstoque)
	{
		Produto = produto;
		Pre�o = preco;
		UnidadesEmEstoque = uniEstoque;
	}
	public String getDadosProduto()
	{
		String DadosProduto=("Produto: "+Produto+"\nPre�o: R$"+Pre�o+"\nUnidades em estoque: "+UnidadesEmEstoque);
		return DadosProduto;
	}

}
