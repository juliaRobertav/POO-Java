package Relacionamento.Um_Para_Um;

import Relacionamento.Um_Para_Um.Carro;

public class MainCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.estaLigado());
        carro.ligar();
        System.out.println(carro.estaLigado());
        System.out.println(carro.motor.giros());
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());
        carro.frear();
        System.out.println(carro.motor.giros());

    }
}
