package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.classes.Calculadora;

/**
 * ParamentrosTest
 */
public class ParamentrosTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do teste.");
        System.out.println("num 1: "+ num1);
        System.out.println("num 2: "+ num2);
    }
}