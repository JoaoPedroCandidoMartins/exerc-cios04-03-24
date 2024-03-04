import java.util.Scanner;

public class ArmazenaEImprimeNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int indice;

        // Armazena cinco nomes no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicita ao usuário um número correspondente a uma pessoa
        System.out.println("\nDigite um número entre 1 e 5 para selecionar um nome:");
        indice = scanner.nextInt();

        // Verifica se o número está dentro do intervalo e imprime o nome correspondente
        if (indice > 0 && indice <= 5) {
            System.out.println("Nome selecionado: " + nomes[indice - 1]);
        } else {
            System.out.println("Número inválido. Por favor, selecione um número entre 1 e 5.");
        }

        scanner.close();
    }
}

Quando você executa este programa, ele primeiro pede que você digite os cinco nomes. Depois que os nomes são armazenados, ele pede que você insira um número entre 1 e 5. Se o número estiver dentro do intervalo correto, ele imprime o nome correspondente. Se não, ele informa ao usuário sobre o erro e solicita um número válido. Note que os índices em Java começam em 0, então para acessar o i-ésimo elemento do vetor, você deve referenciá-lo como `i-1`.
J Armazenar nomes e notas das PR 1 e PR2 de 15 alunos. Calcular e armazenar a média arredondada. Armazenar também a situação do aluno: AP ou RP. Imprimir
uma listagem contendo nome notas media e situação de cada aluno tabulando .

 Aqui está um algoritmo em Java que atende à sua solicitação:

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