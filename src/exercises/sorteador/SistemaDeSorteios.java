package sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {
    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador<String> sorteador = new Sorteador<>(elementos);
        List<Grupo<String>> grupos = sorteador.agrupar(3);

        for (Grupo<String> grupo : grupos) {
            System.out.println(grupo.toSring());
        }
    }
}
