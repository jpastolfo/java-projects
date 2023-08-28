package interfaces;

public class Golfinho implements Nadador, Amamentador {

    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void respirar() {
        System.out.println("Respirando!");
    }

}
