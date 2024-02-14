package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1006 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        double A, B, C, media;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
