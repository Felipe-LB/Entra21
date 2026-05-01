package POO.Abstracao.Exercicios.Exercicio1;

public class Cachorro extends AnimalAbstract{


    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    String emitirSom() {
        return "AU AU AU";
    }
}
