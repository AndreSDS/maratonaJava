package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //calc.someDoisNumeros(5,5);
        //calc.subtraiDoisNumeros(5,5);
        //calc.multiplicaDois(5,5);

        //double result = calc.dividDoisnumeros(20, 5);
        //System.out.println(result);

        //calc.imprimeDoisNumerosDivididos(15, 5);
        
        int[] numer = {1,2,3,4,5};
        calc.somaArray(numer);
        calc.somaVarArgs(1,2,3,4,5);
    }
    
}