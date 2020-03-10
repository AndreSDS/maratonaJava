package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Professor prof2 = new Professor();

        prof.nome = "João";
        prof.matricula = "1231231231";
        prof.rg = "2323232323";
        prof.cpf = "23423423423";

        prof2.nome = "Joana";
        prof2.matricula = "31231";
        prof2.rg = "99882323";
        prof2.cpf = "2888823423";

        prof.imprime();
        prof2.imprime();
    }
}