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

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print(){
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Nome do especialidade: "+this.especialidade);
        System.out.println("Seminários participantes ");
        for (Seminario sem : seminarios) {
            System.out.println(sem.getTitulo() + " ");
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
