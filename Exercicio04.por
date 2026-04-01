programa {
  funcao inicio() {
    inteiro senha_correta = 1234
    inteiro senha_digitada = 0
    inteiro tentativas = 1

    escreva("--- SISTEMA DE LOGIN ---\n")


    enquanto (tentativas <= 3) {
      escreva("Tentativa ", tentativas, "/3 - Digite a senha: ")
      leia(senha_digitada)

      se (senha_digitada == senha_correta) {
        escreva("\nACESSO PERMITIDO!")

        tentativas = 4 
      } senao {
        escreva("Senha incorreta!\n")
        
        se (tentativas == 3) {
          escreva("\nACESSO BLOQUEADO!")
        }
        
        tentativas = tentativas + 1
      }
    }
  }
}