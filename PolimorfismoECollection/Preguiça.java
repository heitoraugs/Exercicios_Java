package Ex_1507;

public class Preguiça extends Animal {
	public Preguiça()
	{
		super();
	}
	public String som () {
		String somPreguiça = "Aarrrr...Bocejo.";
		return somPreguiça;
	}
	public String movimento() {
		String movimentoPreguiça = "Subindo a árvore.";
		return movimentoPreguiça;
	}
	public String mostraPreguica()
	{
		return "Nome da preguiça: "+nome+"\nIdade da preguiça: "+idade+" anos\nEle está vindo...\n"+som()+"\nE vem..."+movimento();
	}
}
