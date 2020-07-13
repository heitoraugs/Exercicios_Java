package POO;

public class Ex_4_1307_Funcionario {

	public static void main (String args[])
	{
		/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, 
		 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		Funcionario funcionario = new Funcionario("Heitor Augusto",20,5,4,2018,3.500,"Desenvolvedor","Luquinhas","São Paulo");
		System.out.println(funcionario.getDadosFuncionario());
	}
}
