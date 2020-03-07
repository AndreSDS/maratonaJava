public class OperadoresLogicos {
    public static void main(String[] args) {

        /*
        compara x && y
        && - retorna true se as duas condtions sejam verdade

        compara x || y
        || - retorna true se uma das duas conditions sejam verdade
         */

        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 3000);
        System.out.println(idade >= 18 || salario >= 3000);
    }
}
