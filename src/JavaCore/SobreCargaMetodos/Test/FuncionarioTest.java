package JavaCore.SobreCargaMetodos.Test;

import JavaCore.SobreCargaMetodos.Classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("André", "11223344555", 4500,"33555443344");

        funcionario.imprime();
    }
}