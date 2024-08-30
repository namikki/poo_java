
public class TestarEmpregado {
	public static void main (String[] args) {
		
		Empregado e1 = new Empregado("Bianca", "Rua 1", "(11) 11111-1111", 2, 2500.0, 0.15);
		
		e1.exibirPessoa();
		
		//Modificando valores de Código do Setor, Salário Base e Imposto
		e1.setCodigoSetor(4);
		e1.setSalarioBase(3000.0);
		e1.setImposto(0.20);
		
		//Exibindo dados atualizados
		e1.exibirPessoa();
	}

}
