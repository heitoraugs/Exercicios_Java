package Ex_1507;

public class Pregui�a extends Animal {
	public Pregui�a()
	{
		super();
	}
	public String som () {
		String somPregui�a = "Aarrrr...Bocejo.";
		return somPregui�a;
	}
	public String movimento() {
		String movimentoPregui�a = "Subindo a �rvore.";
		return movimentoPregui�a;
	}
	public String mostraPreguica()
	{
		return "Nome da pregui�a: "+nome+"\nIdade da pregui�a: "+idade+" anos\nEle est� vindo...\n"+som()+"\nE vem..."+movimento();
	}
}
