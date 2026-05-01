package br.com.entra21.poo.Polimorfismo.exemplo3;

public class Boleto extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com boleto!");
    }
}