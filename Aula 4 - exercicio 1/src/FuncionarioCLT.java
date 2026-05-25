public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        // Retorna o salário base com desconto de 10%
        return salarioBase - (salarioBase * 0.10);
    }
}