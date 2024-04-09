package revisao;

import java.util.Scanner;

public class sequencial5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, numpecas1, numpecas2;
        double valor1, valor2, total;

        cod1 = sc.nextInt();
        numpecas1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        numpecas2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = valor1 * numpecas1 + valor2 * numpecas2;

        System.out.println(" O valor total é: " + total);

        sc.close();




    }

}
