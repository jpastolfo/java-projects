package sorteador;

import java.util.ArrayList;
import java.util.List;

public class Agrupador<T> {

    private final Sorteador<T> sorteador;

    public Agrupador(List<T> elementos) {
        this.sorteador = new Sorteador<>(elementos);
    }

    public List<Grupo<T>> agrupar(int numeroDeGrupos) {
        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGrupos);
        while (sorteador.possuiElementos()) {
            for (Grupo<T> grupo : grupos) {
                grupo.adicionarNoGrupo(sorteador.sortear());
                if (!sorteador.possuiElementos()) break;
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
