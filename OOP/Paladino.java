public class Paladino extends Jogador{

    @Override
    public boolean atacar(Jogador oponente){

        int deltaX = Math.abs(this.x-oponente.x);
        int deltaY = Math.abs(this.y-oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida-=20;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida-=20;
        }else {
            return false;
        }
        return true;
    }



    public void defender(){

    }


}
