package br.com.entra21.poo.Basico.exercicios.tres;

public class PrincipalExercicioTres {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(100);

        System.out.println(cb.sacar(20));

        System.out.println(cb.sacar(-50));

        System.out.println(cb.sacar(0));

        System.out.println(cb.sacar(10_000));
    }
}
