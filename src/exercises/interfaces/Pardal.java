package interfaces;

public class Pardal implements Voador, Animal {

    @Override
    public void voar() {
        Voador.super.voar();
        System.out.println("Voando baixo!");
    }

    @Override
    public void movimentar() {
        voar();
    }
}
