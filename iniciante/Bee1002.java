package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1002{
  public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double raio, area;
        double n = 3.14159;

        raio = sc.nextDouble();

        area = n * (raio * raio);

        System.out.printf("A=%.4f%n",+ area);

        sc.close();
    }
}