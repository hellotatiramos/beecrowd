package iniciante;

import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, resultado;

        A = scan.nextInt();
        B = scan.nextInt();

        resultado = B/A;

        if(A % B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
