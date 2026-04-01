programa {
  funcao inicio() {
    inteiro numero
    inteiro contador = 1

    escreva("Digite um número: ")
    leia(numero)

    enquanto (contador <= 10){
      escreva(numero , "x", contador, "=", numero * contador, "\n")
      contador++
    }
  }
}
