
public class Empregado extends Pessoa {
	//Atributos específicos de Empregado
	int codigoSetor;
	double salarioBase;
	double imposto;
	
	Empregado(){
		this.codigoSetor = 0;
		this.salarioBase = 0.0;
		this.imposto = 0.0;
	}
	
	//Construtor Empregado com atributos de Pessoa
	Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto){
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//getters e setters de Empregado
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//Calcular imposto sobre o salário
	public double obterSalario() {
		double valorImposto = salarioBase * imposto;
		return salarioBase - valorImposto;
	}
	
	//Método para obter informações de Empregado
	public void exibirPessoa() {
		super.exibirPessoa();
		System.out.println("Salário Base: " + salarioBase);
		System.out.println("Imposto: " + imposto);
		System.out.println("Salário Final: " + obterSalario());
	}

}
