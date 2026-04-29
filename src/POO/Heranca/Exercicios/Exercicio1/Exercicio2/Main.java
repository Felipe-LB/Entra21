package POO.Heranca.Exercicios.Exercicio1.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Fernando", "fernando@gmail.com", "Java");

        System.out.println("O nome do professor é: " + professor.getNome() + " e seu email é: " + professor.getEmail()
        + " e sua disciplina é: " + professor.getDisciplina());
    }
}
