import java.util.Scanner;

public class FraseMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String frase;
        
        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();

        do {
            // Exibir o menu
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() < 4) {
                        System.out.println("Frase muito curta para esta operação.");
                    } else {
                        System.out.println("Caracteres: " + frase.substring(0, 2) + frase.substring(frase.length() - 2));
                    }
                    break;
                case 3:
                    String fraseEspelhada = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase espelhada: " + fraseEspelhada);
                    break;
                case 4:
                    System.out.println("Terminando o algoritmo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }