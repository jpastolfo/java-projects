package sorteador;

import java.util.List;
import java.util.Random;

public interface Sorteador<T> {

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    T sortear();

    boolean possuiElementos();

}
