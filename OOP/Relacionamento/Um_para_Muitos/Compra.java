package Relacionamento.Um_para_Muitos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){ //tipo e parametro
        itens.add(item);
    }

    double obterValorTotal(){
        double total=0;
        //acumulador
        for (Item item: itens) {
        //para cada item na minha lista de itens vou adicionar a qtd*preco no total
            total+= item.quantidade * item.preco;
        }
        return total;
    }


}
