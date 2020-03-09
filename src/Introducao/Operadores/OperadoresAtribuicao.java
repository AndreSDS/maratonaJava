package Introducao.Operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {

        /*
         = atribui
         -= subtrai e atribui
         += soma e atribui
         *= multiplica e atribui
         /= divide e atribui
         %= pega o resto e atribui
         */

        int salario = 1800;
       // salario = salario + 1000;
        salario += 1000;
        System.out.println("Salário mais 1000 = "+salario);

        // salario = salario - 1000;
        salario -= 1000;
        System.out.println("Salário menos 1000 = "+salario);

        // salario = salario * 1000;
        salario *= 1000;
        System.out.println("Salário vezes 1000 = "+salario);

        // salario = salario / 1000;
        salario /= 1000;
        System.out.println("Salário dividido por 1000 = "+salario);

        // salario = salario % 1000;
        salario %= 1000;
        System.out.println("Resto da divisão de salário por 1000 = "+salario);

    }
}
