package Relacionamento.Um_Para_Um;

public class Carro {

    Motor motor = new Motor(); //instância

    //classe carro vai manipular o motor
    void acelerar(){
        motor.fatorInjecao+=0.4;//incrementa
    }

    void frear(){
        motor.fatorInjecao-=0.4;//decrementa
    }

    void ligar(){
        motor.Ligado=true;
    }

    void desligar(){
        motor.Ligado=false;
    }

    boolean estaLigado(){//retornar o valor p saber se o motor está ligado
        return motor.Ligado;
    }


}
