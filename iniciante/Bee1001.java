package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1001 {
  public static void main(String[] args) throws IOException {

        int A, B, resultado;

        Scanner scan = new Scanner (System.in);

        A = scan.nextInt();
        B = scan.nextInt();

        resultado = A + B;

        System.out.println("X = " + resultado);
    }
}
