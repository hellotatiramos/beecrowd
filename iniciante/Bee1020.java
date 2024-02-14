package iniciante;

import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idadeEmDias = scan.nextInt();

        int ano = idadeEmDias / 365;
        idadeEmDias = idadeEmDias % 365;

        int mes = idadeEmDias / 30;
        idadeEmDias = idadeEmDias % 30;

        int dias = idadeEmDias;

        System.out.printf("%d ano(s) %n", ano);
        System.out.printf("%d mes(es) %n", mes);
        System.out.printf("%d dia(s) %n", dias);
    }
}
