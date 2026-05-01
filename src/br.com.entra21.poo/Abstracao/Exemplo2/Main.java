package br.com.entra21.poo.Abstracao.Exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("[1] - PIX");
        System.out.println("[2] - Boleto");
        int formaDePagamento = sc.nextInt();

        if (formaDePagamento == 1){
            Pagamento pagamento = new Pix(valorCompra);
            pagamento.processar();
        } else if (formaDePagamento == 2) {
            Pagamento pagamento = new Boleto(valorCompra);
            pagamento.processar();
        } else {
            System.out.println("Digita certo ai mano!");
        }
    }
}
