package JavaCore.modificadorEstaticoTest;
import JavaCore.modificadorStatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Wolks", 300);
        Carro c3 = new Carro("Ferrari", 800);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

