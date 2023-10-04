package Relacionamento.Muitos_para_Muitos;

import java.util.ArrayList;

public class Curso {

    String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
        //adicionando o aluno a esse curso e o curso sendo adicionado ao aluno
    }

    ArrayList<String> obterAlunos(){
        ArrayList<String> cadastrados = new ArrayList<>();
        for(Aluno aluno : alunos) {
        //alunos:lista de obj e cadastrados: lista de String
            cadastrados.add(aluno.nome);
        }
        return cadastrados;
    }


}
