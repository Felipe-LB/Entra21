package POO.Heranca.Exercicios.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 23, "djfklsd46");

        System.out.println("O nome do aluno é: " + aluno.getNome() + " sua idade é: " + aluno.getIdade()
        + " e sua matricula é: " + aluno.getMatricula());
    }
}
