package JavaCore.IntroducaoClasses.Test;

import JavaCore.IntroducaoClasses.Classes.Professor;

/**
 * ProfessorTest
 */
public class ProfessorTest {

    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "João";
        prof.matricula = "1231231231";
        prof.rg = "2323232323";
        prof.cpf = "23423423423";

        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.cpf);
    }
}