package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("us", "US"));
        Scanner scan = new Scanner(System.in);

        double A, B, C;
        final double PI = 3.14159;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        double triangulo = A * C / 2;
        double circulo = PI * Math.pow(C, 2);
        double trapezio = ((A + B) * C / 2);
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
