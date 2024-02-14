package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en","US"));
        Scanner scan = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double preco1, preco2, total;

        cod1 = scan.nextInt();
        qtd1 = scan.nextInt();
        preco1 = scan.nextDouble();

        cod2 = scan.nextInt();
        qtd2 = scan.nextInt();
        preco2 = scan.nextDouble();

        total = qtd1 * preco1 + qtd2 * preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
