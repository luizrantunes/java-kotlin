import java.util.Scanner;

public class NomeValidador {
    public static void main(String[] args) {
        String nomeArmazenado = "Luiz";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe o seu nome: ");
        String nomeUsuario = scanner.nextLine();
        if (nomeArmazenado.equals(nomeUsuario)) {
            System.out.println("Nome válido.");
            System.out.println("Bom dia, " + nomeUsuario + "! Como podemos ajudar?");
        } else {
            System.out.println("Nome inválido.");
            System.out.println("Desculpe, " + nomeUsuario + ", mas não podemos continuar o atendimento.");
        }
    }
}