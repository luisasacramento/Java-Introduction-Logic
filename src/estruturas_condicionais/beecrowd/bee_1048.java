package estruturas_condicionais.beecrowd;

import java.util.Scanner;

public class bee_1048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double percentual;

        if(salario <= 400.00){
            percentual = 15.0;
        } else if (salario <= 800.00) {
            percentual = 12.00;
        } else if (salario <= 1200.0) {
            percentual = 10.0;

        } else if (salario <= 2000.0) {
            percentual = 7.0;
        }else {
            percentual = 4.0;
        }

        double reajuste = salario * percentual / 100.0;
        double novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", percentual);

    }
}
