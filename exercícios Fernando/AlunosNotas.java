import java.util.Scanner;

public class AlunosNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];
        double[] medias = new double[5];
        
        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
            
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite a nota " + (j + 1) + " de " + nomes[i] + ":");
                notas[i][j] = scanner.nextDouble();
                scanner.nextLine(); // Lê o restante da linha após o número
            }
            
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }
        
        // Impressão da listagem
        System.out.println("Listagem de alunos:");
        System.out.println("Nome do Aluno\tNota 1\tNota 2\tMédia");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + "\t\t" + notas[i][0] + "\t" + notas[i][1] + "\t" + medias[i]);
        }
        
        scanner.close();
    }
}
Certifique-se de ter o `Scanner` liberado para uso, caso contrário, você terá problemas na execução do programa. Este código pedirá ao usuário que insira o nome de cada aluno e suas duas notas. Depois de armazenar todos os dados, ele calculará a média das notas e imprimirá uma lista com os nomes dos alunos, suas notas e suas médias.