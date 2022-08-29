
public class Pessoa {

	String nome;
	String dataNascimento;
	String telefone;
	String genero;
	
	public Pessoa() {}
	
	public Pessoa (String nome, String dataNascimento, String telefone, String genero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.genero=genero;
	}
 
	public String getNome() {
		return nome;
	}
	
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	
	public void setDataNascimento (String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	
	public void setGenero (String genero) {
		this.genero = genero;
	}
	
	
	/*Override
	public String toString [] {
		return nome;
	}
	}*/
	
	
}
