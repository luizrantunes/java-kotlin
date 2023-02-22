import java.util.Arrays;

public class ListasParaString {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Honda", "Fiat", "Toyota"};
        System.out.println(Arrays.toString(cars));
        cars[1] = "Ferrari";
        System.out.println(cars[1]);
    }
}
