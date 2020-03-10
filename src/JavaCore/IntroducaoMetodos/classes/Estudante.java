package JavaCore.IntroducaoMetodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser inferior a 0.");
            return;
        }
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    //verifica se array notas foi preenchido
    public void isNull() {
        if (this.notas == null ) { 
            System.out.println("Este aluno não possui notas.");
            return;
        }
    }

    public void imprimeDados() {
        this.isNull();

        System.out.println("Nome : "+this.getNome());
        System.out.println("idade : "+this.getIdade());

        int cont = 1;
        for (double nota : this.getNotas()) {
            System.out.println("Nota "+cont+": "+nota);
            cont += 1;
        }   
    }

    public void situacaoMedia() {
        this.isNull();

        float media = 0;
        for (double nota : this.getNotas()) {
            media += nota;
        }
        System.out.println("Nota média: "+ media / this.getNotas().length);

        System.out.println((media >= 6) ? "Situação: Aprovado." : "Situação: Reprovado.");
    }
    
}