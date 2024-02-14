package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome;

        double salario, vendas, total;

        nome = scan.next();
        salario = scan.nextDouble();
        vendas = scan.nextDouble();

        total = salario + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
