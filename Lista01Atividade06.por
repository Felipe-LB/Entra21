programa {
  funcao inicio() {
    //6.	Leia dois números inteiros e exiba o maior deles.
    inteiro numero1, numero2, maior
    escreva("Digite o primeiro número: ")
    leia(numero1)
    escreva("Digite o segundo número: ")
    leia(numero2)

    se(numero1>numero2){
      escreva("O primeiro número é maior ", numero1)
    } senao se(numero1 == numero2){
      escreva("Os dois números são iguais")
    }
    senao{
      escreva("O segundo número é maior ", numero2)
    }
  }
}
