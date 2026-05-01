package br.com.entra21.poo.Abstracao.Exercicios.Exercicio1;

public class Gato extends AnimalAbstract{


    public Gato(String nome) {
        super(nome);
    }

    @Override
    String emitirSom() {
        return "MIAU MIAU";
    }
}
