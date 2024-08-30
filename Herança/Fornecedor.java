
public class Fornecedor extends Pessoa {
	//Atributos específicos de Fornecedor
	private double valorCredito;
	private double valorDivida;
	
	//Construtor
	public Fornecedor() {
		super();
		this.valorCredito = 0.0;
		this.valorDivida = 0.0;
	}
	
	//Construtor com atributos de Pessoa e Fornecedor
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone); //Chama o construtor da classe Pessoa
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//getters e setters
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//Calculando o saldo da conta do Fornecedor
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	//Metodo para obter os dados do fornecedor
	public void exibirPessoa() {
		super.exibirPessoa();
		System.out.println("Crédito: " + valorCredito);
		System.out.println("Dívida: " + valorDivida);
		System.out.println("Saldo: " + obterSaldo());
	}

}
