package exercises.ex1;

public class Quadrado implements Forma2D {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
