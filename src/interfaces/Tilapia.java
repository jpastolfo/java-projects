package interfaces;

public class Tilapia extends Animal implements Nadador {

    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void respirar() {
        System.out.println("Respirando!");
    }

    @Override
    public void nadar() {
        Nadador.super.nadar();
    }
}
