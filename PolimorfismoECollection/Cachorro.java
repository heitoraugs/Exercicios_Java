package Ex_1507;

public class Cachorro extends Animal{
	public Cachorro()
	{
		super();
	}
	public String som () {
		String somCachorro = "Au au au!";
		return somCachorro;
	}
	public String movimento() {
		String movimentoCachorro = "Carrendo!";
		return movimentoCachorro;
	}
	public String mostraCachorro()
	{
		return "Nome do cachorro: "+nome+"\nIdade do cachorro: "+idade+" anos\nEle está vindo...\n"+som()+"\nE vem..."+movimento();
	}

}

