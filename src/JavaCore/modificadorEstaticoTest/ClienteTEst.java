package JavaCore.modificadorEstaticoTest;

import JavaCore.BlocoInicializacao.Classes.Cliente;

/**
 * ClienteTEst
 */
public class ClienteTEst {

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();


        System.out.println("Quantidade de parcelas.");

        for (int parcela : cli.getParcelas()) {
            System.out.println(parcela + " ");
        }

        System.out.println("Tamanho: "+Cliente.getParcelas().length);
    }
}
