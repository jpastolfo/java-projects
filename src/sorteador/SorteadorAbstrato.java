package sorteador;

import java.util.List;
import java.util.Random;

public abstract class SorteadorAbstrato<T> implements Sorteador<T> {

    private final List<T> elementos;

    public SorteadorAbstrato(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        int indiceSorteado = getIndiceSorteado();
        return elementos.remove(indiceSorteado);
    }

    protected abstract int getIndiceSorteado();

    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    protected int quantidadeElementos() {
        return elementos.size();
    }
}
