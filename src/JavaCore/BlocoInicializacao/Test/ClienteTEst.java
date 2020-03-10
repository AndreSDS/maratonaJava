package JavaCore.BlocoInicializacao.Test;

import JavaCore.BlocoInicializacao.Classes.Cliente;

/**
 * ClienteTEst
 */
public class ClienteTEst {

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();

        System.out.println("Quantidade de parcelas.");

        for (int parcela : cli.getParcelas()) {
            System.out.println(parcela + " ");
        }
    }
}

