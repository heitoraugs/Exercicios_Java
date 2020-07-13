package POO;

public class Patinete {

	private String CorPat;
	private String DonoPat;
	private double ValorPat;
	private String CondicaoPat;
	private String FormaPat;
	private String ModeloPat;
	
	public Patinete (String donoPat,String corPat,double valorPat,String condicaoPat,String formaPat,String modeloPat)
	{
		DonoPat = donoPat;
		CorPat = corPat;
		ValorPat = valorPat;
		CondicaoPat = condicaoPat;
		FormaPat = formaPat;
		ModeloPat = modeloPat;
	}
	public String getDadosPatinete()
	{
		String dadosPatinete ="O patinete � de "+DonoPat+" e � "+CorPat+"\nValor do patinete: R$"+ValorPat+"\nEst�: "+CondicaoPat+"\nO patinete foi: "+FormaPat+"\nDo modelo: "+ModeloPat;
		return dadosPatinete;
	}
}

