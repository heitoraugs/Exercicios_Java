package Ex_Heranca1407;

public class Ex_01_Pessoa {
	protected String nome;
	protected String enderešo;
	protected String telefone;
	
	public Ex_01_Pessoa (String nome,String enderešo,String telefone)
	{
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String mostrarDados()
	{
		return nome+telefone+enderešo;
	}
}
