package POO;

public class Cliente {
	private String NomeDoCliente;
	private int IdadeDoCliente;
	private String UltimoProdComprado;
	private String FormaDePagamentoFav;
	private double TotalGasto;
	
	public Cliente (String nomeCliente,int idadeCliente,String ultimoProd,String formaDePagFav,double totalGasto)
	{
		NomeDoCliente = nomeCliente;
		IdadeDoCliente = idadeCliente;
		UltimoProdComprado = ultimoProd;
		FormaDePagamentoFav = formaDePagFav;
		TotalGasto = totalGasto;
	}
	public String getDadosCliente()
	{
		String dadosCliente ="\nNome do cliente: "+NomeDoCliente+"\nIdade do cliente: "+IdadeDoCliente+" anos"+"\n\n\t\tCompras"+"\nÚltimo produto comprado: "+UltimoProdComprado+"\nForma de pagamaento favorita: "+FormaDePagamentoFav+"\nTotal gasto em produtos: R$"+TotalGasto;
		return dadosCliente;
	}

}
