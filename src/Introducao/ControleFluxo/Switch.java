package Introducao.ControleFluxo;

public class Switch {
    public static void main(String[] args) {
        byte dia = 1;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da útil");
                break;
            default:
                System.out.println("Opação inválida!");
        }
    }
}
