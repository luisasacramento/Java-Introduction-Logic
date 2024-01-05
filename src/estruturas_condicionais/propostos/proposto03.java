package estruturas_condicionais.propostos;

import java.util.Locale;
import java.util.Scanner;

public class proposto03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
    }
}
