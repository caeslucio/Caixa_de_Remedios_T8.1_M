import java.util.ArrayList;


public class CaixaRemedios {

	public static void main(String[]args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList();
		
		  //Pessoa pessoaX = new Pessoa("Pessoa X", "DD/MM/AAAA", "61 9.0000-0000", "Masculino");
		
			Pessoa pessoa1 = new Pessoa("Pessoa A", "25/02/1998", "61 9.0000-0001", "Masculino");
			
			Pessoa pessoa2 = new Pessoa("Pessoa B", "03/04/1976", "61 9.0000-0002", "Feminino");
			
			Pessoa pessoa3 = new Pessoa("Pessoa C", "29/05/1946", "61 9.0000-0003", "Masculino");
			
			Pessoa pessoa4 = new Pessoa("Pessoa D", "26/09/2008", "61 9.0000-0004", "Feminino");
			
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			pessoas.add(pessoa4);
	
			

		for (Pessoa c: pessoas) {	
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Data de nascimento: "+c.getDataNascimento());
			System.out.println("Telefone: "+c.getTelefone());
			System.out.println("Genero: "+c.getGenero()+"\n\n");
		}
	
		System.out.println("Total de pessoas cadastradas: " + pessoas.size());
		
		pessoas.remove(pessoa1);
		
		System.out.println(pessoas.contains(pessoa1)); //verifica se determinada pessoa está no cadastro, retornando "true" ou "false"
	}
		
}
	

