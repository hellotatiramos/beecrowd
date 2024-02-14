package iniciante;

import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSegundos = scan.nextInt();

        int qtdHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        int qtdMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        int qtdSegundos = totalSegundos;

        System.out.printf("%d:%d:%d%n", qtdHoras, qtdMinutos,qtdSegundos);
    }
}
