package revisao;

import java.util.Scanner;
public class sequencial1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a , b, resultado;

        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.println("A SOMA é : " + resultado);



        sc.close();
    }
}
