package exercises.ex4;

public class AccessDeniedException extends RuntimeException {

    AccessDeniedException() {super("Senha inválida. Os administradores serão informados.");}

}
