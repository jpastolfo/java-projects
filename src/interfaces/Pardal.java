package interfaces;

public class Pardal extends Animal implements Voador {

    @Override
    public void voar() {
        Voador.super.voar();
        System.out.println("Voando baixo!");
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void movimentar() {
        voar();
    }

    @Override
    public void respirar() {
        System.out.println("Respirando!");
    }
}
