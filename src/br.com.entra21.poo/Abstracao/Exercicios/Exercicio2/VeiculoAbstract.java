package br.com.entra21.poo.Abstracao.Exercicios.Exercicio2;

public abstract class VeiculoAbstract {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public VeiculoAbstract(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();
}
