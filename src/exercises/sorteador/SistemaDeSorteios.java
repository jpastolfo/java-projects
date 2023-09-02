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
        Sorteador sorteador = new Sorteador(elementos);
        List<Grupo> grupos = sorteador.agrupar(3);

        for (Grupo grupo : grupos) {
            System.out.println(grupo.toSring());
        }
    }
}
