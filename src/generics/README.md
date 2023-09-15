# Questions and Exercises: Generics

Taken from [The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html).

1. Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
2. Will the following class compile? If not, why?
    ```java
   public final class Algorithm {
       public static <T> T max(T x, T y) {
           return x > y ? x : y;
       }
    }
    ```
3. Write a generic method to exchange the positions of two different elements in an array.

4. If the compiler erases all type parameters at compile time, why should you use generics?

5. What is the following class converted to after type erasure?
    ```java
    public class Pair<K, V> {
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }

        public void setKey(K key)     { this.key = key; }
        public void setValue(V value) { this.value = value; }
    
        private K key;
        private V value;
    }
   ```
6. What is the following method converted to after type erasure? 
    ```java
    public static <T extends Comparable<T>>
        int findFirstGreaterThan(T[] at, T elem) {
        // ...
    }
    ```
7. a