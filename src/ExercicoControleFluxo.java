public class ExercicoControleFluxo {
    public static void main(String[] args) {
        int valor = 100;

        for (int i = 0; i <= valor ; i++) {
            if (i % 2 == 0) {
                if (i == 20) {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
