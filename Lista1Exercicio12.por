programa {
  funcao inicio() {
    //12.	Leia um valor em graus Celsius e converta para Fahrenheit.
    real grausCelsius, grausFahrenheit
    escreva("Digite a temperatura atual em graus Celsius: ")
    leia(grausCelsius)

    grausFahrenheit = grausCelsius * 1.8 + 32

    escreva("A temperatura atual em graus Fahrenheit é: ", grausFahrenheit, "F")

  }
}
