package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double media =((A * 3.5) + (B * 7.5)) /11;

        System.out.printf("MEDIA = %.5f", media);
    }
}
