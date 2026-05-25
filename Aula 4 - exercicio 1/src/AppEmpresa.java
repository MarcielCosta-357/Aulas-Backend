public class AppEmpresa {
    public static void main(String[] args) {
        // Criação dos objetos
        Funcionario clt = new FuncionarioCLT("Ana Souza", 3000.0);
        Funcionario pj = new FuncionarioPJ("Carlos Mendes", 5000.0);

        // Exibindo dados do Funcionário CLT
        System.out.println("--- Dados do Funcionário CLT ---");
        clt.exibirDados();
        System.out.println("Salário Final: R$ " + clt.calcularSalarioFinal());

        // Exibindo dados do Funcionário PJ
        System.out.println("\n--- Dados do Funcionário PJ ---");
        pj.exibirDados();
        System.out.println("Salário Final: R$ " + pj.calcularSalarioFinal());
    }
}
