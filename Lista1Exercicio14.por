programa {
  funcao inicio() {
    //14.	Declare uma variável que representa um salário e calcule um aumento de 10%.

    real salarioFuncionario, aumento
    escreva("Digite o salário do funcionário: ")
    leia(salarioFuncionario)
    
    aumento = salarioFuncionario * 0.10
    salarioFuncionario = salarioFuncionario + aumento

    escreva("O salário do funcionário com um aumento de 10% é: ", salarioFuncionario, " Reais")
  }
}
