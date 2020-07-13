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
		String dadosFuncionario = "Nome do funcionário: "+nomeFunc+"\nIdade do funcionário: "+idadeFunc+" anos"+"\nAdmissão: "+diaAd+"/"+mesAd+"/"+anoAd+"\nSalário: R$ "+salarioFunc+"\nCargo: "+cargoFunc+"\nGestor responsável: "+gestorFunc+"\nLocalidade de trabalho: "+localidadeFunc;
		return dadosFuncionario;
	}
}
