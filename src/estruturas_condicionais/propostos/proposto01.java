package estruturas_condicionais.propostos;

import java.util.Locale;
import java.util.Scanner;
public class proposto01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");

        }
    }

}
