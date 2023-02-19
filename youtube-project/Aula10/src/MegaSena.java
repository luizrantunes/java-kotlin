import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();

        /*int x;
        x = 0;

        while(x < 6) {
            int number;
            number = generate.nextInt(60);
            System.out.println(number);
            x = x + 1;
        } */

        for(int i = 0; i < 6; i++) {
            int number;
            number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
