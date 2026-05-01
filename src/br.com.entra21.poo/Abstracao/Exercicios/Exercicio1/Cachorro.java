package br.com.entra21.poo.Abstracao.Exercicios.Exercicio1;

public class Cachorro extends AnimalAbstract{


    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    String emitirSom() {
        return "AU AU AU";
    }
}
