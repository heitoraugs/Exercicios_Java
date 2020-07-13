package POO;

public class Funcionario {
	private String nomeFunc;
	private int idadeFunc;
	private int diaAd;
	private int mesAd;
	private int anoAd;
	private double salarioFunc;
	private String cargoFunc;
	private String gestorFunc;
	private String localidadeFunc;
	
	public Funcionario(String nomeFuncionario,int idadeFuncionario,int diaAdmissao,int mesAdmissao,int anoAdmissao,double salarioFuncionario,String cargoFuncionario,String gestorFuncionario,String localFuncionario)
	{
		nomeFunc = nomeFuncionario;
		idadeFunc = idadeFuncionario;
		salarioFunc = salarioFuncionario;
		cargoFunc = cargoFuncionario;
		gestorFunc = gestorFuncionario;
		localidadeFunc = localFuncionario;
		diaAd = diaAdmissao;
		mesAd = mesAdmissao;
		anoAd = anoAdmissao;
	}
	public String getDadosFuncionario()
	{
		String dadosFuncionario = "Nome do funcion�rio: "+nomeFunc+"\nIdade do funcion�rio: "+idadeFunc+" anos"+"\nAdmiss�o: "+diaAd+"/"+mesAd+"/"+anoAd+"\nSal�rio: R$ "+salarioFunc+"\nCargo: "+cargoFunc+"\nGestor respons�vel: "+gestorFunc+"\nLocalidade de trabalho: "+localidadeFunc;
		return dadosFuncionario;
	}
}
