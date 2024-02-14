package iniciante;

import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distanciaFornecida = scan.nextInt();
        int qtdMinutos = (60 * distanciaFornecida) /30;

        System.out.println(qtdMinutos + " minutos");
    }
}
