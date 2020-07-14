package Ex_Heranca1407;
public class Ex_02_Teste {
	public static void main (String args[])
	{
		Ex_02_Fornecedor fornecedor = new Ex_02_Fornecedor("Heitor","Rua 2","9 1234-5678",250.50,150.50);
		System.out.println(fornecedor.getobterSaldo());
		System.out.println(fornecedor.mostrarDados());
	}
}
