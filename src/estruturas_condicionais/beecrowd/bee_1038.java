package estruturas_condicionais.beecrowd;

import java.util.Scanner;

public class bee_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y =sc.nextInt();

        double total;

        if (x == 1){
            total = y * 4.00;
            
        }else if( x == 2){
            total = y * 4.50;
            
        } else if (x == 3) {
            total = y *5.00;

        } else if (x == 4) {
            total= y * 2.00;

        }else {
            total = y * 1.50;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);

    }
}
