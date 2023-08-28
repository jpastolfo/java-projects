package interfaces;

public abstract class Animal {
    void alimentar() {
        System.out.println("Alimentando");
    }

    abstract void movimentar();
    abstract void respirar();

}
