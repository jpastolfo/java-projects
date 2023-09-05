package projeto.model;

import java.util.List;

public class Filme implements Entidade<Integer> {

    private int id;
    private String nome;
    private String categoria;
    private List<Ator> atores;
    private List<Diretor> diretores;

    @Override
    public Integer getID() {
        return id;
    }
}
