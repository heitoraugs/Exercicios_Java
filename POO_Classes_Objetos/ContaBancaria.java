package POO;

public class ContaBancaria {
	private String NomeCliente;
	private String BancoCliente;
	private double DocumentoCliente;
	private String TipoDeConta;
	private double SaldoDaConta;
	
	public ContaBancaria(String nomeCliente,String bancoCliente,double documentoCliente,String tipoDeConta,double saldoDaConta)
	{
		NomeCliente = nomeCliente;
		BancoCliente = bancoCliente;
		DocumentoCliente = documentoCliente;
		TipoDeConta = tipoDeConta;
		SaldoDaConta = saldoDaConta;
	}
	public String getDadosContaBancaria()
	{
		String dadosContaBancaria = "Nome do cliente: "+NomeCliente+"\nBanco: "+BancoCliente+"\nDocumento do Cliente: "+DocumentoCliente+"\nTipo de conta: "+TipoDeConta+"\nSaldo da conta: R$"+SaldoDaConta;
		return dadosContaBancaria;
	}

}
