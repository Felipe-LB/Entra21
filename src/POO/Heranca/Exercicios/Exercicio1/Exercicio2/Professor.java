package POO.Heranca.Exercicios.Exercicio1.Exercicio2;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
