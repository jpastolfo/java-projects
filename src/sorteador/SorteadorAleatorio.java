package sorteador;

import java.util.List;
import java.util.Random;

public class SorteadorAleatorio<T> extends SorteadorAbstrato<T> {

    public SorteadorAleatorio(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        Random randomIndex = new Random();
        return randomIndex.nextInt(quantidadeElementos());

    }
}
