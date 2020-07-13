package POO;

public class Ex_6_1307_ContaBancaria {
	public static void main (String args[])
	{
		/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto conta bancaria, 
		 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		ContaBancaria conta = new ContaBancaria("Heitor Augusto","Itau",99999-9,"Salário",3.000);
		System.out.println(conta.getDadosContaBancaria());
	}

}
