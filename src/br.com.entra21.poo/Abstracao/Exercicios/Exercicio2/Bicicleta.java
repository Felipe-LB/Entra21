package br.com.entra21.poo.Abstracao.Exercicios.Exercicio2;

public class Bicicleta extends VeiculoAbstract{


    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta: " + getModelo() + " está pedalando!");
    }


}
