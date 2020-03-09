package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.someDoisNumeros(5,5);
        calc.subtraiDoisNumeros(5,5);
        calc.multiplicaDois(5,5);

        System.out.println("Chamou o dois métodos!");

    }
    
}