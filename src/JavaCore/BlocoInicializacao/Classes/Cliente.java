package JavaCore.BlocoInicializacao.Classes;

/**
 * Cliente
 */
public class Cliente {

    private static int[] parcelas;
    
    //boco de inicialização
    static {
        parcelas = new int[100];
        System.out.print("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente(){};

    public Cliente(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    
}