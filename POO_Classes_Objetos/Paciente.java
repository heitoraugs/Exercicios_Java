package POO;

public class Paciente {
	private String NomePaciente;
	private int IdadePaciente;
	private String AcompanhantePaciente;
	private String EnfermidadePaciente;
	private String CondicaoPaciente;
	private String PreCondicaoPaciente;
	
	public Paciente (String nomePaciente,int idadePaciente,String AcompPac,String EnfermPac,String CondPac,String PreCondPac)
	{
		NomePaciente = nomePaciente;
		IdadePaciente = idadePaciente;
		AcompanhantePaciente = AcompPac;
		EnfermidadePaciente = EnfermPac;
		CondicaoPaciente = CondPac;
		PreCondicaoPaciente = PreCondPac;
	}
	public String getDadosPaciente()
	{
		String dadosPaciente = "Nome do paciente: "+NomePaciente+"\nIdade do paciente: "+IdadePaciente+" anos\nAcompanhante do paciente: "+AcompanhantePaciente+"\nEnfermidade do paciente: "+EnfermidadePaciente+"\nCondi��o atual do paciente: "+CondicaoPaciente+"\nCondi��o pr�-existente: "+PreCondicaoPaciente;
		return dadosPaciente;
	}
}
