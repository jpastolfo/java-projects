package exercises.ex2;

import exercises.constantes;

public class Cilindro implements Forma3D {

    double raio;
    double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double volume() {
        return constantes.PI*raio*raio*altura;
    }

    @Override
    public double area() {
        return 2*constantes.PI*raio*(raio+altura);
    }
}
