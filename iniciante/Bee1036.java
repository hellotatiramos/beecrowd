package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a == 0) | (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
            return;
        }

        double bhaskara = Math.sqrt((b * b) - 4 * a * c);
        double R1 = (-b + bhaskara) / (2 * a);
        double R2 = (-b - bhaskara) / (2 * a);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
}

