package POO;

public class Avião {
	private String NomePiloto;
	private String NomeCoPiloto;
	private int NumeroPassageiros;
	private int NumeroTripulantes;
	private int HorasDeVoo;
	private String Destino;
	
	public Avião (String nomePiloto,String nomeCoP,int numP,int numT,int horasVoo,String destino)
	{
		NomePiloto = nomePiloto;
		NomeCoPiloto = nomeCoP;
		NumeroPassageiros = numP;
		NumeroTripulantes = numT;
		HorasDeVoo = horasVoo;
		Destino = destino;
	}
	public String getDadosAviao()
	{
		String DadosAviao = "Piloto: "+NomePiloto+"\nCo-Piloto: "+NomeCoPiloto+"\nNúmero de tripulantes: "+NumeroTripulantes+"\nNúmero de passageiros: "+NumeroPassageiros+"\nDuração do voo: "+HorasDeVoo+" horas"+"\nDestino do voo: "+Destino;
		return DadosAviao;
	}

}
