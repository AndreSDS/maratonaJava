package JavaCore.Associacao.Classes;

public class Aluno {
    private String nome;
    private String idade;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        }else{
            System.out.println("Aluno não está inscrito em nenhum seminário.");
        }
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
