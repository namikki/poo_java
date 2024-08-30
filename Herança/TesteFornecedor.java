
public class TesteFornecedor {
	public static void main (String[] args) {
		
		//Criando um Fornecedor usando o construtor completo
		Fornecedor f1 = new Fornecedor("Bianca", "Rua 1", "(11) 11111-1111", 1000.0, 300.0);
		
		//Exibindo os dados do fornecedor f1
		f1.exibirPessoa();
		
		//Testando o método de obter o saldo
		System.out.println("Saldo calculado: " + f1.obterSaldo());
		
		//Modificando os valores de crédito e dívida
		f1.setValorCredito(5000.0);
		f1.setValorDivida(500.0);
		
		//Exibindo dados atualizados
		System.out.println("\nDados atualizados");
		f1.exibirPessoa();
	}

}
