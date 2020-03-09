package JavaCore.IntroducaoClasses.Test;

import JavaCore.IntroducaoClasses.Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.placa = "dxa6767";
        carro.modelo = "Pegout206";
        carro.velocidadeMax = 220f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMax);
    }
}