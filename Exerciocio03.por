programa {
  funcao inicio() {
    inteiro numero
    inteiro positivos = 0
    inteiro negativos = 0


    escreva("Digite um número (ou 0 para sair): ")
    leia(numero)

    enquanto (numero != 0) {
   
      se (numero > 0) {
        positivos = positivos + 1
      } senao {
  
        negativos = negativos + 1
      }

      escreva("Digite outro número (ou 0 para sair): ")
      leia(numero)
    }

    escreva("\n Resultado Final ")
    escreva("\nTotal de positivos: ", positivos)
    escreva("\nTotal de negativos: ", negativos)
    escreva("\nPrograma encerrado.")
  }
}