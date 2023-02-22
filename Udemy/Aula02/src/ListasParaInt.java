import java.util.Arrays;

public class ListasParaInt {
    public static void main(String[] args) {
        int[]numbers = {9, 7, 5, 3, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
    }
}