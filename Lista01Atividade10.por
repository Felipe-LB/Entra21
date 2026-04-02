programa {
  funcao inicio() {
    //10.	Crie uma expressão que verifica se um número é múltiplo de 5 e de 3 ao mesmo tempo. 
    inteiro numero, multiplo

    escreva("Digite um número")
    leia(numero)
    
    se(numero%3 ==0 e numero%5 == 0){
      escreva("O número digitado é múltiplo de 3 e 5 ao mesmo tempo!")
    }
    senao{
      escreva("Esse número não é múltiplo de 3 e 5 ao mesmo tempo!")
    }
  }
}
