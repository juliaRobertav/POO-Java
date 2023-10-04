package Relacionamento.Um_para_Muitos;

import Relacionamento.Um_para_Muitos.Compra;
import Relacionamento.Um_para_Muitos.Item;

public class MainCompra {
    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.adicionarItem(new Item("Notebbok", 2, 5000));
        compra.adicionarItem(new Item("Celular", 3, 4000));
        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());


    }
}
