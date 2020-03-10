package JavaCore.IntroducaoMetodos.classes;

public class Calculadora {

    public void someDoisNumeros(int a, int b) {
        System.out.println(a+b);
    }

    public void subtraiDoisNumeros(int a, int b) {
        System.out.println(a+b);
    }

    public void multiplicaDois(int a, int b) {
        System.out.println(a * b);
    }

    public double dividDoisnumeros(double a, double b){
        //previnindo que não haja divisão por 0
        if (a != 0 && b != 0) {
           return a / b;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double a, double b) {
        if (a != 0 && b != 0) {
            System.out.println(a/b);
           return;
        }
        System.out.println("Não é possível dividir por 0!");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println("Dentro do metodo alteraDoisNumeros.");
        System.out.println("num 1: "+a);
        System.out.println("num 2: "+b);
    }

    public void somaArray(int []numeros){
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }

    //var args
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }

}