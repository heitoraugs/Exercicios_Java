package Ex_Heranca1407;

public class Ex_01_Pessoa {
	protected String nome;
	protected String endere�o;
	protected String telefone;
	
	public Ex_01_Pessoa (String nome,String endere�o,String telefone)
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String mostrarDados()
	{
		return nome+telefone+endere�o;
	}
}
