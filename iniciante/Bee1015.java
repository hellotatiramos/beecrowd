package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distanciaXY = Math.sqrt(Math.pow(x2 - y2, 2) + Math.pow(x1 - y1, 2));

        System.out.printf("%.4f%n", distanciaXY);
    }
}
