package sorteador;

import java.util.List;

public class SorteadorPrimeiro<T> extends SorteadorAbstrato<T> {

    public SorteadorPrimeiro(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return 0;
    }
}
