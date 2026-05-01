package br.com.entra21.poo.Abstracao.Exercicios.Exercicio1;

public abstract class AnimalAbstract {
    private String nome;

    public AnimalAbstract(String nome) {
        this.nome = nome;
    }

    abstract String emitirSom();

}
