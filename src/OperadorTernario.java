public class OperadorTernario {
    public static void main(String[] args) {

        float salario = 2000.00f;
        float inposto5;
        float inposto10;
        float inposto15;
        float inposto20;

        if (salario < 1000) {
            inposto5 = (float) (salario - (salario * 0.05));
        }else if (salario >= 1000 && salario < 2000) {
            System.out.println(inposto10 = (float) (salario - (salario * 0.10)));
        }else if (salario >= 2000 && salario < 4000) {
            System.out.println(inposto15 =  (float) (salario - (salario * 0.15)));
        }else{
            System.out.println(inposto20 = (float) (salario - (salario * 0.20)));
        }
    }
}
