package POO;

public class Ex_7_1307_Paciente {
	public static void main(String args[])
	{
		/*Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto paciente, 
		 *defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
		Paciente paciente1 = new Paciente("Luquinhas",22,"Nenhum","Fratura no bra�o","Est�vel","Press�o alta");
		System.out.println(paciente1.getDadosPaciente());
	}

}
