package Ex_1507;

public class TesteAnimal {
	public static void main(String args[])
	{
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguiça preguiça = new Preguiça();

	cachorro.setNome("Max");
	cachorro.setIdade(2);
	cavalo.setNome("Cavalindo");
	cavalo.setIdade(15);
	preguiça.setNome("Augusto");
	preguiça.setIdade(20);
	
	System.out.println(cachorro.mostraCachorro());
	System.out.println("\n");
	System.out.println(cavalo.mostraCavalo());
	System.out.println("\n");
	System.out.println(preguiça.mostraPreguica());
	
	}
}

