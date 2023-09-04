package interfaces;

public class Golfinho extends Animal implements Nadador, Amamentador {

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void respirar() {
        System.out.println("Respirando!");
    }


}
