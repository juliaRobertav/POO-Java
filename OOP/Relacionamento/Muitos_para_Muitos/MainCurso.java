package Relacionamento.Muitos_para_Muitos;

public class MainCurso {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("VsDia");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        System.out.println(curso1.obterAlunos());
        System.out.println(curso2.obterAlunos());
        System.out.println(curso3.obterAlunos());

        aluno1.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso1);

        System.out.println(aluno1.obterCursos());
        System.out.println(aluno2.obterCursos());
        System.out.println(aluno3.obterCursos());


    }
}
