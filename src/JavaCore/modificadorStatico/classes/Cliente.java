package JavaCore.modificadorStatico.classes;

/**
 * Cliente
 */
public class Cliente {

    private static int[] parcelas;
    
    //boco de inicialização
    {
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

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
    
}