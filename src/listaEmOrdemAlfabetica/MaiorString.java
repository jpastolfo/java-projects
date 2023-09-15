package listaEmOrdemAlfabetica;

public class MaiorString {
    public static void main(String[] args) {
        String a = "c";
        String b = "b";
    System.out.println("Maior entre "+a+" e "+b+": " + maior(a,b));
    }

    private static String maior(String primeira, String segunda) {

        return (primeira.compareTo(segunda) > 0) ? primeira : segunda;
    }
}
