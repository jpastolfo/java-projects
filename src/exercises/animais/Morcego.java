package animais;

public class Morcego extends Mamifero {

    void voar() {
        System.out.println("Voando");
    }

    @Override
    public void movimentar() {
        voar();
    }


}