package exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class Formas {

    public static void main(String[] args) {

        Esfera esfera = new Esfera(3);
        Cubo cubo = new Cubo(2);
        Cilindro cilindro = new Cilindro(2,2);

        List<Forma3D> formas = List.of(esfera,cubo,cilindro);

        double area = 0.0d;
        double volume = 0.0d;

        for (Forma3D forma : formas) {
            area += forma.area();
            volume += forma.volume();
        }

        System.out.println(area);
        System.out.println(volume);
    }
}
