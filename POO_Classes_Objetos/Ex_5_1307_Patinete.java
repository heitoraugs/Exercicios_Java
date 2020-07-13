package POO;

public class Ex_5_1307_Patinete {
	public static void main (String args[])
	{
		/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, 
		 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		Patinete patinete = new Patinete("Luquinhas","Rosa brilhante",0,"Novo","Presente","ExtremeDeluxe");
		System.out.println(patinete.getDadosPatinete());
	}

}
