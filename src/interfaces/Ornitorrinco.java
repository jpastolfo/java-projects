package interfaces;

public class Ornitorrinco extends Animal implements Nadador,Amamentador{


    @Override
    void movimentar() {
        nadar();
        System.out.println("Andando também!");
    }

    @Override
    void respirar() {
        System.out.println("Respirando!");
    }
}
