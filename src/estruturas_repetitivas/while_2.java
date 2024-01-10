package estruturas_repetitivas;

import java.util.Scanner;

public class while_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alccol = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo ==1){
                alccol++;
            }
            else if (tipo ==2){
                gasolina++;
            } else if (tipo ==3) {
                diesel++;

            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alccol);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();




    }

}
