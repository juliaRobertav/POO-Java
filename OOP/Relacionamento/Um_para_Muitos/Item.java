package Relacionamento.Um_para_Muitos;

public class Item {
    //Relacionamento 1:n
    //classe menos complexa

    String nome;
    int quantidade;
    double preco;

    public Item(String nome, int quantidade, double preco) { //construtor -> alt+insert
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


}
