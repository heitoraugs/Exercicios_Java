package Ex_1507;

public class Cavalo extends Animal{
	public Cavalo()
	{
		super();
	}
	public String som () {
		String somCavalo = "Poct poct";
		return somCavalo;
	}
	public String movimento() {
		String movimentoCavalo = "Correndo!";
		return movimentoCavalo;
	}	
	public String mostraCavalo()
	{
		return "Nome do cavalo: "+nome+"\nIdade do cavalo: "+idade+"\nEle está vindo...\n"+som()+"\nE vem..."+movimento();
	}
}
