package POO;

public class Ex_1_1307_Cliente {
	public static void main (String args[])
	{
		/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,		 
		 *em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		Cliente cliente1 = new Cliente("Heitor Augusto",20,"Celular","Parcelado",2.400);
		System.out.println(cliente1.getDadosCliente());
		Cliente cliente2 = new Cliente("Luquinhas",22,"Televisão","À vista", 5.000);
		System.out.println(cliente2.getDadosCliente());
	}
}
