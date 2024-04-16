package extras;

import java.util.Scanner;

public class matematica2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Diga o primeiro número");
        num1 = sc.nextDouble();

        System.out.println("Diga o segundo número");
        num2 = sc.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A média aritmética é: " + media);


        sc.close();
    }
}
