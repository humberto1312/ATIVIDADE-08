import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar 5 números
        System.out.println("Digite 5 números:");

        // Inicializa variáveis para armazenar a soma e a quantidade de números
        int soma = 0;
        int quantidade = 0;

        // Lê os 5 números e calcula a soma
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
            quantidade++;
        }

        // Calcula a média
        double media = (double) soma / quantidade;

        // Exibe a soma e a média dos números
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
