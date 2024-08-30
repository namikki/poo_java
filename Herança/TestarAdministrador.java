public class TestarAdministrador {
    public static void main(String[] args) {
        // Criando um administrador usando o construtor completo
        Administrador administrador1 = new Administrador("Bianca", "Rua 1", "(11) 11111-1111", 202, 8000.0, 0.12, 2000.0);

        // Exibindo os dados do administrador
        administrador1.exibirPessoa();

        // Modificando os valores de salário e ajuda de custo
        administrador1.setSalarioBase(8500.0);
        administrador1.setAjudaDeCusto(2500.0);

        // Exibindo os dados atualizados do administrador
        System.out.println("\nDados atualizados:");
        administrador1.exibirPessoa();
    }
}
