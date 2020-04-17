package JavaCore.Associacao.Classes;

import JavaCore.Associacao.Classes.Aluno;
import JavaCore.Associacao.Classes.Seminario;

public class Professor {
    private Seminario[] seminarios;
    private Aluno[] alunos;

    private String nome;
    private String especialidade;

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(final Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor() {
    }

    public Professor(final String nome, final String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Nome do especialidade: " + this.especialidade);

        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminários participantes ");
            for (final Seminario sem : seminarios) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário!");
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(final Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(final String especialidade) {
        this.especialidade = especialidade;
    }

}
