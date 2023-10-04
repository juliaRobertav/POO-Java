public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto(); //Instanciando um produto
        Produto p2 = p1.clone();
        p1.nome = "Computador";
        System.out.println(p1.nome);
        System.out.println(p2.nome);

//        Produto p3 = new Produto("Geladeira", 3000);
//        Produto p4 = new Produto("Celular", 4000, 0.10);
//
//        System.out.println(p3.retornaStringFormatada());
//        System.out.println(p4.retornaStringFormatada());

    }
}