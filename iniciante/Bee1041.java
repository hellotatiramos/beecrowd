package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1041 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double c1 = scan.nextDouble();
        double c2 = scan.nextDouble();

        if (c1 == 0 && c2 == 0) {
            System.out.println("Origem");
        } else if (c1 == 0) {
            System.out.println("Eixo Y");
        } else if (c2 == 0) {
            System.out.println("Eixo X");
        } else if (c2 > 0 && c1 > 0) {
            System.out.println("Q1");
        } else if (c2 > 0 && c1 < 0) {
            System.out.println("Q2");
        } else if (c2 < 0 && c1 < 0) {
            System.out.println("Q3");
        } else if (c2 < 0 && c1 > 0) {
            System.out.println("Q4");
        }
    }
}
