import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dia, mes;
        
        do {
            System.out.print("Digite o dia do seu nascimento (ou 9999 para sair): ");
            dia = scanner.nextInt();
            
            if (dia == 9999) {
                break;
            }
            
            System.out.print("Digite o mês do seu nascimento: ");
            mes = scanner.nextInt();
            
            String horoscopo = determinarHoroscopo(dia, mes);
            System.out.println("Seu horóscopo é: " + horoscopo);
        } while (dia != 9999);
        
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
    
    public static String determinarHoroscopo(int dia, int mes) {
        String signo = "";
        
        switch (mes) {
            case 1:
                signo = (dia <= 20) ? "Capricórnio" : "Aquário";
                break;
            case 2:
                signo = (dia <= 19) ? "Aquário" : "Peixes";
                break;
            case 3:
                signo = (dia <= 20) ? "Peixes" : "Áries";
                break;
            case 4:
                signo = (dia <= 20) ? "Áries" : "Touro";
                break;
            case 5:
                signo = (dia <= 20) ? "Touro" : "Gêmeos";
                break;
            case 6:
                signo = (dia <= 20) ? "Gêmeos" : "Câncer";
                break;
            case 7:
                signo = (dia <= 21) ? "Câncer" : "Leão";
                break;
            case 8:
                signo = (dia <= 22) ? "Leão" : "Virgem";
                break;
            case 9:
                signo = (dia <= 22) ? "Virgem" : "Libra";
                break;
            case 10:
                signo = (dia <= 22) ? "Libra" : "Escorpião";
                break;
            case 11:
                signo = (dia <= 21) ? "Escorpião" : "Sagitário";
                break;
            case 12:
                signo = (dia <= 21) ? "Sagitário" : "Capricórnio";
                break;
            default:
                signo = "Signo não encontrado";
                break;
        }
        
        return signo;
    }
}