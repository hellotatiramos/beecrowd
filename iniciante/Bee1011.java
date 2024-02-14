package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        final double PI = 3.14159;
        double volume = ((4.0 / 3) * PI * Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
