public class Administrador extends Empregado {
    // Atributo específico de Administrador
    private double ajudaDeCusto;

    // Construtor padrão
    public Administrador() {
        super();  // Chama o construtor da classe Empregado
        this.ajudaDeCusto = 0.0;
    }

    // Construtor com parâmetros para as classes Pessoa, Empregado e Administrador
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);  // Chama o construtor da classe Empregado
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getters e Setters para ajudaDeCusto
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Sobrescrita do método calcularSalario para incluir a ajudaDeCusto
    @Override
    public double obterSalario() {
        // Salário do administrador é o salário do empregado acrescido da ajuda de custo
        return super.obterSalario() + ajudaDeCusto;
    }

    // Método para exibir os dados do administrador (inclui atributos herdados de Empregado e Pessoa)
    @Override
    public void exibirPessoa() {
        super.exibirPessoa();  // Exibe os dados da classe Empregado e Pessoa
        System.out.println("Ajuda de Custo: " + ajudaDeCusto);
        System.out.println("Salário Líquido com Ajuda de Custo: " + obterSalario());
    }
}

