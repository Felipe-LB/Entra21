programa {
  funcao inicio() {
    //7.	Crie uma variável booleana que indica se a soma de dois números é maior que 100.
    logico teste
    inteiro numero1, numero2, soma
    escreva("Digite um número: ")
    leia(numero1)
    escreva("Digite um segundo número: ")
    leia(numero2)
    soma = numero1 + numero2
    teste = (soma > 100)
    escreva("A soma dos números é maior que 100: ", teste)
  }
}
