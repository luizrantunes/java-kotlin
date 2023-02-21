import java.util.Scanner;

public class DragonQuest {
    public static void main(String[] args) {
        String name = "Peter";
        String enemy = "Giant Monster Blue";
        int actionOne = 1;
        int actionTwo = 2;
        int actionThree = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apareceu um " + enemy + ". O que você quer fazer?");
        System.out.println("1 - Atacar");
        System.out.println("2 - Item");
        System.out.println("3 - Fugir");
        int action = scanner.nextInt();

        switch (action) {
            case 1 -> {
                System.out.println("Parabéns!" + name + " matou o bicho e ganhou level.");
            }
            case 2 -> {
                System.out.println(name + " usou um item e o bicho fugiu da batalha.");
            }
            case 3 -> {
                System.out.println("Você escapou do bicho com sucesso.");
            }
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
    }
}