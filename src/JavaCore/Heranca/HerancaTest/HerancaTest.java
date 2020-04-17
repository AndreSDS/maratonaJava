package JavaCore.Heranca.HerancaTest;

import JavaCore.Heranca.Classes.Endereco;
import JavaCore.Heranca.Classes.Funcionario;
import JavaCore.Heranca.Classes.Pessoa;

public class HerancaTest {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        p.setNome("ANdré");
        p.setCpf("33224433322");
        end.setRua("Joaquim de paula 53");
        end.setBairro("Jardim Nakamura");

        p.setEndereco(end);
        p.imprime();

        Funcionario f = new Funcionario();

        f.setNome(p.getNome());
        f.setCpf(p.getCpf());
        f.setEndereco(p.getEndereco());
        f.setSalario(1500);

        f.imprime();
    }
    
}