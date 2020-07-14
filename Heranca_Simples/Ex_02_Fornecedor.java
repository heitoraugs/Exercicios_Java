package Ex_Heranca1407;

public class Ex_02_Fornecedor extends Ex_01_Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Ex_02_Fornecedor(String nome,String endereço, String telefone,double valorCredito,double valorDivida)
	{
		super(nome,endereço,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getobterSaldo()
	{
		double obterSaldo = valorCredito-valorDivida;
		return obterSaldo;
	}
}
