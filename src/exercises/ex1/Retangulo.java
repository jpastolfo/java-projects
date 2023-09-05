package exercises.ex1;

public class Retangulo implements Forma2D {

    double comprimento;
    double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return largura*comprimento;
    }
}
