import java.util.Scanner;

public class Exercicio1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        final int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(final int numero) {
        int primeiro = 0;
        int segundo = 1;

        if (numero == primeiro || numero == segundo) {
            return true;
        }

        int proximo;
        while (true) {
            proximo = primeiro + segundo;
            if (proximo == numero) {
                return true;
            } else if (proximo > numero) {
                return false;
            }
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
