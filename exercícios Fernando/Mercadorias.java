import java.util.Scanner;

public class Mercadorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double precoCompra, precoVenda;
        int totalMercadorias = 100;
        int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
        
        for (int i = 0; i < totalMercadorias; i++) {
            System.out.println("\nMercadoria " + (i + 1));
            System.out.print("Digite o preço de compra da mercadoria: ");
            precoCompra = scanner.nextDouble();
            
            System.out.print("Digite o preço de venda da mercadoria: ");
            precoVenda = scanner.nextDouble();
            
            double lucro = ((precoVenda - precoCompra) / precoCompra) * 100;
            
            if (lucro < 10) {
                lucroMenor10++;
            } else if (lucro >= 10 && lucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        System.out.println("\nAnálise de Lucro das Mercadorias:");
        System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);

        scanner.close();
    }
}