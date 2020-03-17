package JavaCore.modificadorStatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidademin;

    public Carro() {
    }

    public void  imprime(){
        System.out.println("------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMax);
        System.out.println(this.velocidademin);
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidademin() {
        return velocidademin;
    }

    public void setVelocidademin(double velocidademin) {
        this.velocidademin = velocidademin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
