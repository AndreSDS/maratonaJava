public class WhileDoWhileFor {
    public static void main(String[] args) {

        int cont = 1;
        while (cont < 10) {
            cont++;
            System.out.println(cont);
        }

        do{
            cont++;
            System.out.println(cont);
        }while (cont < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }
    }
}
