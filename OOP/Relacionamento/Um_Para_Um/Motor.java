package Relacionamento.Um_Para_Um;

public class Motor {
    //Relacionamento 1:1

    double fatorInjecao=1;
    boolean Ligado=false;

    int giros(){

        if(!Ligado){
            return 0;
        }else {
            return (int) Math.round(fatorInjecao*3000); //casting
        }

    }

}
