package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = scan.nextInt();
        horas = scan.nextInt();
        valorHora = scan.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
