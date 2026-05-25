public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        // Retorna o salário base com acréscimo de 20%
        return salarioBase + (salarioBase * 0.20);
    }
}