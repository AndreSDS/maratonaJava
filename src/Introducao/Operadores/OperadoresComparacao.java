package Introducao.Operadores;

public class OperadoresComparacao {
    public static void main(String[] args) {
        /*
        < menor que
        > maior que
        <= menor igual
        >= maior que
        == igualdade
        != diferente
        todos retornam boolean - true or false
         */

        boolean comparandoMenor = 10 < 20;
        boolean comparandoMaior = 10 > 20;
        boolean comparandoMenorIgual = 10 >=20;
        boolean comparandoMaiorIgual = 10 <= 20;
        boolean comparandoIgualdade = 10 == 20;
        boolean comparandoDiferente = 10 != 20;

        System.out.println(comparandoMenor);
        System.out.println(comparandoMaior);
        System.out.println(comparandoMenorIgual);
        System.out.println(comparandoMaiorIgual);
        System.out.println(comparandoIgualdade);
        System.out.println(comparandoDiferente);
    }
}
