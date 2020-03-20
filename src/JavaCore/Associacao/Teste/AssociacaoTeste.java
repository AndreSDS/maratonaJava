package JavaCore.Associacao.Teste;

import JavaCore.Associacao.Classes.Aluno;
import JavaCore.Associacao.Classes.Endereco;
import JavaCore.Associacao.Classes.Professor;
import JavaCore.Associacao.Classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("André Souza", "27");
        Aluno aluno2 = new Aluno("Joana Dark", "33");

        Seminario seminario = new Seminario("Como ser programdor.");
        Professor professor = new Professor("Jaspion", "Matar monstros falsos.");
        Endereco endereco = new Endereco("Rua joaquim de Paula", "Jardim Nakamura");

        seminario.setProfessor(professor);
        seminario.setEndereco(endereco);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        Seminario[] seminarios = new Seminario[1];
        seminarios[0] = seminario;
        professor.setSeminarios(seminarios);

        seminario.print();

    }
}
