package exercises.ex5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        Pageable<String> pageable = new PageableList<>(lista,3);
        System.out.println(pageable);
        System.out.println(pageable.getPage(0));
        System.out.println(pageable.getPage(1));
        System.out.println(pageable.getPage(2));
    }

}
