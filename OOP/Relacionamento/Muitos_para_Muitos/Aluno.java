package Relacionamento.Muitos_para_Muitos;

import java.util.ArrayList;

public class Aluno {
    //Relacionamento n:n

    String nome;
    ArrayList<Curso> cursos= new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    ArrayList<String> obterCursos(){
        ArrayList<String> cadastrados = new ArrayList<>();
        for(Curso curso: cursos){
            cadastrados.add(curso.nome);
        }
        return cadastrados;
    }


}
