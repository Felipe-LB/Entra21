package POO.Abstracao.Exercicios.Exercicio3;

public class Vendedor extends FuncionarioAbstract{
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }
}
