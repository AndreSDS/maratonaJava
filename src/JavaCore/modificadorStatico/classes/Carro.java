package JavaCore.modificadorStatico.classes;

public class Carro {
    private static double velocidadeMax;
    private static String nome;
    private static double velocidademin = 240;

    public Carro() {
    }

    public void  imprime(){
        System.out.println("------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMax);
        System.out.println(velocidademin);
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public static void setVelocidadeMax(double velocidadeMax) {
        Carro.velocidadeMax = velocidadeMax;
    }

    public static double getVelocidademin() {
        return velocidademin;
    }

    public static void setVelocidademin(double velocidademin) {
        Carro.velocidademin = velocidademin;
    }

    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Carro.nome = nome;
    }
}
