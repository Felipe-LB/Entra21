programa {
  funcao inicio() {
    // 15.	Crie uma variável do tipo string e concatene com outra variável para formar uma frase.
    cadeia nome 
    inteiro idade
    cadeia saudacao = "Bem-vindo(a), "
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite sua idade: ")
    leia(idade)

    escreva(saudacao + nome + ", você tem: " + idade + " anos")
  }
}
