package br.com.entra21.poo.Abstracao.Exercicios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        VeiculoAbstract carro = new Carro("BMW");
        VeiculoAbstract bicicleta = new Bicicleta("Trek");

        carro.mover();
        bicicleta.mover();
    }
}
