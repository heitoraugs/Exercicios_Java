package POO;

public class Ex_4_1307_Funcionario {

	public static void main (String args[])
	{
		/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, 
		 *defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
		Funcionario funcionario = new Funcionario("Heitor Augusto",20,5,4,2018,3.500,"Desenvolvedor","Luquinhas","S�o Paulo");
		System.out.println(funcionario.getDadosFuncionario());
	}
}
