package JavaCore.IntroducaoClasses.Test;

import JavaCore.IntroducaoClasses.Classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula = "1231231231";
        joao.idade = 18;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}