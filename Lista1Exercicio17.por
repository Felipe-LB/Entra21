programa {
  funcao inicio() {
    //17.	Verifique se um número fornecido pelo usuário está entre 1 e 100.

    real numero
    escreva("Digite um número: ")
    leia(numero)

    se(numero >= 1 e numero<=100){
      escreva("Esse número, " + numero + " está entre 1 e 100") 
    }
    senao{
      escreva("Esse número, " + numero + " não está entre 1 e 100") 
    }
  }
}
