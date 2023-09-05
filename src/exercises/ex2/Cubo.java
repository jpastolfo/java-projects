package exercises.ex2;

public class Cubo implements Forma3D {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double volume() {
        return Math.pow(lado,3);
    }

    @Override
    public double area() {
        return 6*lado*lado;
    }
}
