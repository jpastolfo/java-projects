package exercises.ex3;

public class Exercicio3 {

    public static void main(String[] args) {
        Stack<String> stack = new StackArrayList<>();
        System.out.println("Stack is empty: " + stack.isEmpty());

        stack.push("Elemento");
        stack.push("Pessoa");
        stack.push("Veículo");

        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Último elemento: " + stack.peek());
        System.out.println("Último elemento: " + stack.pop());
        System.out.println("Último elemento após remoção: " + stack.peek());
        System.out.println("Tamanho: " + stack.size());
    }
}
