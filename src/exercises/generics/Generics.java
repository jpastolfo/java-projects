package generics;

import java.nio.charset.StandardCharsets;

public class Generics {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println("Maior entre a e b: " + maior(a,b));
    }

    private static String maior(String primeira, String segunda) {

        if (primeira.getBytes(StandardCharsets.US_ASCII)[0]
                > segunda.getBytes(StandardCharsets.US_ASCII)[0])
            return "a";
        return "b";

    }
}
