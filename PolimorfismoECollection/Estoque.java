package Ex_1507;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args)
	{	
		//Adicionar dados
		Collection<String> estoque = new ArrayList();
		estoque.add("TV");
		estoque.add("Pc");
		estoque.add("Mouse");
		System.out.println("Dados adicionados: "+estoque);
		
		//Remover dados
		estoque.remove("TV");
		System.out.println("Dados sem TV: "+estoque);
		
		//Atualizar dados
		Collection<String> estoque1 = Arrays.asList("Copo");
		estoque.addAll(estoque1);
		System.out.println("Dados atualizados: "+estoque);
		
		//Apresentar
		for(String estoquizinho: estoque)
		{
			System.out.println("Apresentação dos dados: "+estoquizinho);
		}
	}
}
