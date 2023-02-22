import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    int calculo = 0;

        while (calculo > 4 || calculo < 1) {
            System.out.println("Bem vindo ao programa calculadora.\n");
            Scanner calculoScanner = new Scanner(System.in);
            System.out.println("Qual ação você quer utilizar?\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
            calculo = calculoScanner.nextInt();

            if (calculo == 1) {
                Scanner numeroUmScanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int numeroUm = numeroUmScanner.nextInt();
                Scanner numeroDoisScanner = new Scanner(System.in);
                System.out.print("Digite o segundo número: ");
                int numeroDois = numeroDoisScanner.nextInt();
                int somar = numeroUm + numeroDois;
                System.out.print("A soma é: " + somar);
            }
            if (calculo == 2) {
                Scanner numeroUmScanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int numeroUm = numeroUmScanner.nextInt();
                Scanner numeroDoisScanner = new Scanner(System.in);
                System.out.print("Digite o segundo número: ");
                int numeroDois = numeroDoisScanner.nextInt();
                int subtrair = numeroUm - numeroDois;
                System.out.print("A subtração é: " + subtrair);
            }
            if (calculo == 3) {
                Scanner numeroUmScanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int numeroUm = numeroUmScanner.nextInt();
                Scanner numeroDoisScanner = new Scanner(System.in);
                System.out.print("Digite o segundo número: ");
                int numeroDois = numeroDoisScanner.nextInt();
                int multiplicar = numeroUm * numeroDois;
                System.out.print("A multiplicação é: " + multiplicar);
            }
            if (calculo == 4) {
                Scanner numeroUmScanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int numeroUm = numeroUmScanner.nextInt();
                Scanner numeroDoisScanner = new Scanner(System.in);
                System.out.print("Digite o segundo número: ");
                int numeroDois = numeroDoisScanner.nextInt();
                int dividir = numeroUm / numeroDois;
                System.out.print("A divisão é: " + dividir);
            } if (calculo > 4 || calculo < 1)
                System.out.println("\nNão entendi. Tente novamente.\n");
        }
    }
}