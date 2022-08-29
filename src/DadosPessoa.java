import java.util.ArrayList;

public class DadosPessoa {

	ArrayList<Pessoa> pessoas = new ArrayList();

	public void cadastraPessoa(Pessoa pessoa) {
		
		pessoas.add(pessoa); //método para inserir contato
	}
	
	public int num_de_Pessoas() { //retorna no número de pessoas cadastradas
		return pessoas.size();
		
	}
	
	
}
