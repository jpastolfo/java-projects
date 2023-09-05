package projeto.model;

public class Diretor implements Entidade<String> {

    private String nome;

    @Override
    public String getID() {
        return nome;
    }
}
