package sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {

    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        //if (elementos.isEmpty()) return null;
        Random randomIndex = new Random();
        int numeroSorteado = randomIndex.nextInt(elementos.size());
        return elementos.remove(numeroSorteado);
    }

    public List<Grupo> agrupar(int numeroDeGrupos) {
        List<Grupo> grupos = new ArrayList<>(numeroDeGrupos);
        for (int i = 0; i < numeroDeGrupos; i++) {
            grupos.add(new Grupo(i));
        }

        while (!elementos.isEmpty()) {
            for (Grupo grupo : grupos) {
                grupo.adicionarNoGrupo(sortear());
                if (elementos.isEmpty()) break;
            }
        }
        return grupos;
    }
}
