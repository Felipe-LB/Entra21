programa {
  inclua biblioteca Texto --> tx
 //18.	Leia um texto e exiba o número de caracteres usando Length.
  funcao inicio() {
    cadeia texto = ""
    inteiro tamanho  
    escreva("Digite algum texto: ")
    leia(texto)

    tamanho = tx.numero_caracteres(texto)


    escreva("A frase possui ", tamanho, " caracteres.")
  }
}
