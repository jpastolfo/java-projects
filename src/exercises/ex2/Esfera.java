package exercises.ex2;

import exercises.constantes;
import exercises.ex1.Forma2D;

public class Esfera implements Forma3D {

    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double volume() {
        return (4.0/3.0)* constantes.PI*Math.pow(raio,3);
    }

    @Override
    public double area() {
        return 4*constantes.PI*raio*raio;
    }
}
