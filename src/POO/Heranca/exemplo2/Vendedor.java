package POO.Heranca.exemplo2;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, Double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double getSalarioTotal(){
        return this.getSalarioBase() + this.comissao;
    }
}
