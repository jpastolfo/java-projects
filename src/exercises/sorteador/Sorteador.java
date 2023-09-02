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

    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }
}
