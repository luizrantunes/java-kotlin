import java.util.Scanner;

public class NovoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String name = scanner.nextLine();
        System.out.println("Tudo bem, " + name + "?");
    }
}
