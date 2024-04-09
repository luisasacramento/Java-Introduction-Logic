package revisao;

import java.util.Scanner;

public class sequencial2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;
        raio= sc.nextDouble();
        area = raio*2 *3.14159;

        System.out.println(" O RESULTADO É " + area);
        sc.close();
    }

}
