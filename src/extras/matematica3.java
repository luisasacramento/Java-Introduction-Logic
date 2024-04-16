package extras;

import java.util.Scanner;

public class matematica3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;


        System.out.println("Diga o primeiro nota");
        num1 = sc.nextDouble();

        System.out.println("Diga o segundo nota");
        num2 = sc.nextDouble();

        System.out.println("Diga o terceiro nota");
        num3 = sc.nextDouble();

        double media = (num1 + num2+ num3)/ 3;
        System.out.println("A média das notas é :" + media);


    }
}
