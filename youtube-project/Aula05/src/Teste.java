import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroGuardado = 42;

        System.out.print("Informe um número: ");
        int numeroInformado = sc.nextInt();

        if (numeroInformado == numeroGuardado) {
            System.out.println("Você acertou! O número é " + numeroGuardado);
        } else {
            System.out.println("Você errou. O número correto é " + numeroGuardado);
        }
    }
}