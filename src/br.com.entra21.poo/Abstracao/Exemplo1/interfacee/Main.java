package br.com.entra21.poo.Abstracao.Exemplo1.interfacee;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3, 4);

        System.out.println("Á área do círculo é: " + circulo.calcularArea());
        System.out.println("Á área do retângulo é: " + retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometrica = new Circulo(2);
        interfaceFormaGeometrica.calcularArea();
    }
}
