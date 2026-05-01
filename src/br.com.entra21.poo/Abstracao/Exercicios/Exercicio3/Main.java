package br.com.entra21.poo.Abstracao.Exercicios.Exercicio3;

public class Main {
    public static void main(String[] args) {
        FuncionarioAbstract vendedor = new Vendedor("Felipe" ,3000, 200);

        System.out.println("O salário do Vendedor: " + vendedor.calcularSalario());
    }
}
