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

        if (professor != null ) {
            System.out.printf("Professor palestrante: %s%n", this.professor.getNome());
        }else{
            System.out.println("Nenhum professor cadastrado neste seminário!");
        }
        
        if (this.endereco != null) {      
            System.out.printf("Local: rua, %s- Bairro: %s%n", this.endereco.getBairro(), endereco.getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para esse seminário!");
        }

        if (alunos != null && alunos.length != 0) {
            System.out.print("Alunos participantes: ");
            for (Aluno aluno: alunos) {
                System.out.printf("%s, ", aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno inscrito neste seminário!");
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
