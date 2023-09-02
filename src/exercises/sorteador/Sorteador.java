package sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador<T> {

    private final List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        Random randomIndex = new Random();
        int numeroSorteado = randomIndex.nextInt(elementos.size());
        return elementos.remove(numeroSorteado);
    }

    public List<Grupo<T>> agrupar(int numeroDeGrupos) {
        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGrupos);
        while (!elementos.isEmpty()) {
            for (Grupo<T> grupo : grupos) {
                grupo.adicionarNoGrupo(sortear());
                if (elementos.isEmpty()) break;
            }
        }
        return grupos;
    }

    private static <T> List<Grupo<T>> inicializarGrupos(int numeroDeGrupos) {
        List<Grupo<T>> grupos = new ArrayList<>();
        for (int i = 0; i < numeroDeGrupos; i++) {
            grupos.add(new Grupo(i));
        }
        return grupos;
    }
}
