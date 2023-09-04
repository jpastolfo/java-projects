package interfaces;

public class Vaca extends Animal implements Amamentador {

    @Override
    public void movimentar() {
        System.out.println("Andando!");
    }

    @Override
    void respirar() {

    }
}
