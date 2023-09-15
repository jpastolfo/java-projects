package generics;

import java.util.Collection;
import java.util.Collections;

public class ex1 {
    public static <T> int countElements(Collection<T> collection, UnaryPredicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) ++count;
        } return count;
    }
}

interface UnaryPredicate<T> {
    public boolean test(T obj);
}
