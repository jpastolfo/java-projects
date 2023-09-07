package exercises.ex4;

public class Classified<T> {

    private T objeto;
    private String senha;

    public Classified(T objeto, String senha) {
        this.objeto = objeto;
        this.senha = senha;
    }

    public T get(String senha) {
        if (this.senha.equals(senha)) return objeto;
        throw new AccessDeniedException();
    }

    @Override
    public String toString() {
        return "Objeto sigiloso [*****]";
    }
}
