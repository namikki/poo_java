
public class Pessoa {
	String nome;
	String endereco;
	String telefone;
	
	
	//Construtor padrão
	Pessoa(){
		this.nome = "";
		this.endereco = "";
		this.telefone = "";
	}
	
	//Construtor com nome, endereço e telefone
	Pessoa(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void exibirPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
	}
}
