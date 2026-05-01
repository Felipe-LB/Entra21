package br.com.entra21.poo.Heranca.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Felipe", 23);
        Aluno aluno = new Aluno("Felipe", 23, "salkfjkld6565");

        aluno.apresentar();

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
    }

}
