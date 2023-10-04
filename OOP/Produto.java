public class Produto implements Cloneable{ //classe Protudo vai utilizar métodos da classe Clone

    String nome;
    double preco;
    double desconto;

    //método construtor é sempre executado
    Produto(){
        this("Vazio");
    }

    Produto(String nome){ //nome = parametro do construtor
        this.nome = nome; //this = atributo da classe
    }

    public Produto(String nome, double preco) { //construtor
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;//this->faz referencia ao obj que esta manipulando
        this.preco = preco;
        this.desconto = desconto;
    }

    String retornaStringFormatada(){
        return String.format("O produto %s está com o preço %f e com o desconto %f",
                nome, preco, desconto);
    }

    @Override
    public Produto clone(){
        try {
            Produto clone = (Produto) super.clone();
            return  clone;
        }
        catch (CloneNotSupportedException e){
            throw  new AssertionError("Cópia não deu certo");
        }

    }

}
