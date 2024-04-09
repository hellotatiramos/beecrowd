package iniciante;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Bee1045{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double[] lados = new double[3];

        for (int i = 0; i < 3; i++) {
            lados[i] = scanner.nextDouble();
        }

        Arrays.sort(lados);

        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && B != C) || (B == C && C != A) || (C == A && A != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
