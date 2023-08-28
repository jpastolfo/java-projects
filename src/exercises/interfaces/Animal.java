package interfaces;

public interface Animal {
    default void alimentar() {
        movimentar();
        System.out.println("Alimentando");
    }

    void movimentar();
    void respirar();

}
