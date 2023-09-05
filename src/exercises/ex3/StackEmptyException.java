package exercises.ex3;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super("Operation not allowed. Stack is empty!");
    }

}
