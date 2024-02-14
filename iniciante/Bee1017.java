package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdHoras = scan.nextInt();
        int velocidadeMediaHora = scan.nextInt();
        int qtdKm = qtdHoras * velocidadeMediaHora;

        double qtdLitrosGastos = qtdKm / 12.0;

        System.out.printf("%.3f%n", qtdLitrosGastos);
    }
}
