package Ex_1507;

public class TesteAnimal {
	public static void main(String args[])
	{
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Pregui�a pregui�a = new Pregui�a();

	cachorro.setNome("Max");
	cachorro.setIdade(2);
	cavalo.setNome("Cavalindo");
	cavalo.setIdade(15);
	pregui�a.setNome("Augusto");
	pregui�a.setIdade(20);
	
	System.out.println(cachorro.mostraCachorro());
	System.out.println("\n");
	System.out.println(cavalo.mostraCavalo());
	System.out.println("\n");
	System.out.println(pregui�a.mostraPreguica());
	
	}
}

