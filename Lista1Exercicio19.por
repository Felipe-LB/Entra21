programa {
  inclua biblioteca Texto --> tx
  funcao inicio() {
    // 19.	Receba duas strings e compare se elas são iguais, ignorando maiúsculas e minúsculas.

    cadeia textoUm, textoDois
    inteiro resultado

    escreva("Digite um texto: ")
    leia(textoUm)
    escreva("Digite outro texto: ")
    leia(textoDois)

  
    se (tx.caixa_alta(textoUm) == tx.caixa_alta(textoDois)) {
      escreva("As palavras são iguais.")
    } senao {
      escreva(textoUm, " é diferente de ", textoDois)
    }
  }

}

