package ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa("Maria",LocalDate.of(2003,Month.FEBRUARY,28));
        Pessoa joao = new Pessoa("João", LocalDate.of(2000,Month.FEBRUARY,9));

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(List.of(maria,joao));

        System.out.println("Lista de pessoas: ");
        System.out.println(pessoas);
        Collections.sort(pessoas);

        System.out.println("Lista ordenada: ");
        System.out.println(pessoas);

    }


}
