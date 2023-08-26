package listaEmOrdemAlfabetica;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("João");
        lista.add("André");
        lista.add("Marisa");
        lista.add("Igor");

        System.out.println("Lista: ");
        System.out.println(lista);

        Collections.sort(lista);

        System.out.println("Lista ordenada: ");
        System.out.println(lista);
    }

}
