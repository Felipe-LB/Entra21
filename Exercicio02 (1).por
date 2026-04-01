programa {
  funcao inicio() {
    inteiro estoque
    escreva("Digite a quantidade do produto: ")
    leia(estoque)

    enquanto(estoque >= 0){
  
      se(estoque >= 1 e estoque <= 4){
        escreva("Estoque baixo!")
      }senao se(estoque == 0 ){
        escreva("Zerado!")
      }
      leia(estoque)
      }
    
    }
  }


