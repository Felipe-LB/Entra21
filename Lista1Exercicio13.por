programa {
  funcao inicio() {
    //13.	Crie um programa que recebe três números e exibe a média aritmética.

    real numeroUm, numeroDois, numeroTres, mediaAritmetica
    escreva("Digite um número: ")
    leia(numeroUm)
    escreva("Digite um segundo número: ")
    leia(numeroDois)
    escreva("Digite um erceiro número: ")
    leia(numeroTres)

    mediaAritmetica = (numeroUm + numeroDois + numeroTres) / 3

    escreva("A média aritmética dos três números é: " + mediaAritmetica)
  }
}
