package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int cod = scan.nextInt();
        int qtd = scan.nextInt();

        double total;

        if (cod == 1) {
            total = qtd * 4.00;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
        else if (cod == 2) {
            total = qtd * 4.50;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
        else if (cod == 3) {
            total = qtd * 5.00;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
        else if (cod == 4) {
            total = qtd * 2.00;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
        else {
            total = qtd * 1.50;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
    }
}
