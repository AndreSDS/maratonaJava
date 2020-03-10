package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
      
        Estudante aluno1 = new Estudante();

        aluno1.setNome("André");
        aluno1.setIdade(15);
        aluno1.setNotas(new double[]{5,6,8});

        aluno1.imprimeDados();
        aluno1.situacaoMedia();
    }
    
}