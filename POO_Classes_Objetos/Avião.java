package POO;

public class Avi�o {
	private String NomePiloto;
	private String NomeCoPiloto;
	private int NumeroPassageiros;
	private int NumeroTripulantes;
	private int HorasDeVoo;
	private String Destino;
	
	public Avi�o (String nomePiloto,String nomeCoP,int numP,int numT,int horasVoo,String destino)
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
		String DadosAviao = "Piloto: "+NomePiloto+"\nCo-Piloto: "+NomeCoPiloto+"\nN�mero de tripulantes: "+NumeroTripulantes+"\nN�mero de passageiros: "+NumeroPassageiros+"\nDura��o do voo: "+HorasDeVoo+" horas"+"\nDestino do voo: "+Destino;
		return DadosAviao;
	}

}
