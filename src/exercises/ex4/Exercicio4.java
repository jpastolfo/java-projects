package exercises.ex4;

public class Exercicio4 {

    public static void main(String[] args) {
        String name = "Manu";
        Double value = 0.002d;
        Classified<String> classified = new Classified<>(name, "123456");
        Classified<Double> secretValue = new Classified<>(value, "123456");

        System.out.println(classified.get("123456"));
        System.out.println(secretValue.get("12345"));


    }

}
