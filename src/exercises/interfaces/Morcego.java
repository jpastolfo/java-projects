package interfaces;

public class Morcego extends Animal implements Voador, Amamentador {

    @Override
    void movimentar() {
        voar();
    }

    @Override
    void respirar() {
        System.out.println("Respirando!");
    }
}
