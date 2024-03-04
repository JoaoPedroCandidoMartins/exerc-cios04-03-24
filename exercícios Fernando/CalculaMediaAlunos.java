import java.util.Scanner;

public class CalculaMediaAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[15];
        double[] notaPr1 = new double[15];
        double[] notaPr2 = new double[15];
        double[] media = new double[15];
        String[] situacao = new String[15];
        
        // Solicita e armazena os nomes, notas e calcula média e situação de cada aluno
        for (int i = 0; i < 15; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            
            System.out.print("Digite a nota da PR1 do aluno " + nomes[i] + ": ");
            notaPr1[i] = scanner.nextDouble();
            
            System.out.print("Digite a nota da PR2 do aluno " + nomes[i] + ": ");
            notaPr2[i] = scanner.nextDouble();
            
            media[i] = Math.round((notaPr1[i] + notaPr2[i]) / 2);
            
            if (media[i] >= 60) {
                situacao[i] = "AP";
            } else {
                situacao[i] = "RP";
            }
        }

        // Imprime a listagem com nome, notas, média e situação de cada aluno
        System.out.println("\nListagem de Alunos:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|   Nome   |   Nota PR1   |   Nota PR2   |   Média   |  Situação  |");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%9s|%13.1f|%13.1f|%10.1f|%12s|\n", nomes[i], notaPr1[i], notaPr2[i], media[i], situacao[i]);
        }
        System.out.println("--------------------------------------------------------------");

        scanner.close();
    }
}