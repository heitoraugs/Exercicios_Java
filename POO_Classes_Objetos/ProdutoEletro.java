package POO;

public class ProdutoEletro {
	private String Produto;
	private double Preço;
	private int UnidadesEmEstoque;
	
	public ProdutoEletro (String produto, double preco,int uniEstoque)
	{
		Produto = produto;
		Preço = preco;
		UnidadesEmEstoque = uniEstoque;
	}
	public String getDadosProduto()
	{
		String DadosProduto=("Produto: "+Produto+"\nPreço: R$"+Preço+"\nUnidades em estoque: "+UnidadesEmEstoque);
		return DadosProduto;
	}

}
