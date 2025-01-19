import java.util.Scanner;
import java.util.Random;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==== Brincadeira de Advinhar o Número do Sistema ====");
        int numeroSecreto = random.nextInt(100) + 1;  // Número aleatório entre 1 e 100


        String entrada;
        do {
            System.out.println("Digite um número ( ou 'sair' para encerrar): " );
            entrada = scanner.next(); // Lê como string

             // Verifica se o usuário deseja encerrar
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Converte a entrada para número
            int numeroPensado;
            try {
                numeroPensado = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'sair'.");
                continue;
            }


            if (numeroPensado > numeroSecreto) {
                System.out.println("O número que você informou é MAIOR que o do sistema");
            } else if (numeroPensado < numeroSecreto) {
                System.out.println("O número que voçê informou é MENOR que o do sistema");
            } else if (numeroPensado == numeroSecreto) {
                System.out.printf("Parabéns, o número é: %d%n", numeroSecreto);
                break;
            }
        } while (true);

        scanner.close();
    }
}