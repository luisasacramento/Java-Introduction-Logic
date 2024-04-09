package revisao;

import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("É NEGATIVO");
            
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
