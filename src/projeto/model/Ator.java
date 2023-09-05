package projeto.model;

public class Ator implements Entidade<String> {
    private String cpf;
    private String nome;

    @Override
    public String getID() {
        return cpf;
    }
}
