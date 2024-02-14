package iniciante;

import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " eh o maior");
        } else if (num2 > num3) {
            System.out.println(num2 + " eh o maior");
        } else {
            System.out.println(num3 + " eh o maior");
        }
    }
}
