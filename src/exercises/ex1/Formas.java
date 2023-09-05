package exercises.ex1;

import java.util.ArrayList;
import java.util.List;

public class Formas {

    public static void main(String[] args) {
        List<Forma2D> formas = new ArrayList<>();
        formas.add(new Circulo(1));
        formas.add(new Quadrado(2));
        formas.add(new Retangulo(3,2));

        double area = 0.0d;
        for (Forma2D forma : formas) {
            area += forma.area();
        }

        System.out.println(area);

    }

}
