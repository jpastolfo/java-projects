package exercises.ex3;

public interface Stack<T> {

    /**
     * Receives an element and add it to the stack.
     */
    void push(T element);

    /**
     * Removes the last element of the stack.
     * @return T
     */
    T pop();

    /**
     * Checks the last element of the stack. If the stack is empty, exception.
     * @return Returns the last element
     * @exception StackEmptyException
     */
    T peek();

    /**
     * Returns the amount of elements in stack.
     * @return amount of elements in stack
     */
    int size();

    /**
     * Checks if the stack is empty.
     * @return boolean
     */
    boolean isEmpty();
}
