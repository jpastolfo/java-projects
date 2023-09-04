package exercises.ex1;

import exercises.constantes;

public class Circulo implements Forma2D {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return constantes.PI * Math.pow(raio,2);
    }
}
