package POO.Abstracao.Exercicios.Exercicio2;

public class Carro extends VeiculoAbstract{
    public Carro(String modelo) {
        super(modelo);
    }


    @Override
    public void mover() {
        System.out.println("O veículo: " + getModelo() + " Está movendo!" );
    }


}
