public class Bruxo extends Jogador{

    @Override
    public boolean atacar(Jogador oponente){

        super.atacar(oponente); //acessar o objeto pai de um objeto,  é usada para acessar a classe pai de uma classe
        super.atacar(oponente);
        super.atacar(oponente);

        return true;
    }


}
