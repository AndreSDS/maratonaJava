package JavaCore.Associacao.Classes;

public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Endereco endereco;
    private String titulo;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.printf("Título: %s%n", this.titulo);
        System.out.printf("Professor palestrante: %s%n", this.professor.getNome());
        System.out.printf("Local: rua, %s- Bairro: %s%n", this.endereco.getBairro(), endereco.getBairro());
        System.out.print("Alunos participantes: ");
        for (Aluno aluno: alunos) {
            System.out.printf("%s, ", aluno.getNome());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
