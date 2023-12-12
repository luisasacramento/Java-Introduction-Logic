package vetores;

import java.util.Scanner;

public class proposto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] genero = new char[N];

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            genero[i] = sc.next().charAt(0);
        }

        //Maior altura
        double maiorAltura = altura[0];


        for (int i = 1; i < N; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];

            }
        }
        System.out.printf("Maior altura:  %.2f%n", maiorAltura);


        //Menor Altura
        double menorAltura = altura[0];


        for (int i = 1; i < N; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];

            }
        }

        System.out.printf("Menor altura:  %.2f%n", menorAltura);

        double somaDasAlturasDasMulheres = 0.0;
        int contMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (genero[i] == 'F') {
                somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + altura[i];
                contMulheres++;
            }
        }
        if (contMulheres == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoas");
        }
        else {
            double media = somaDasAlturasDasMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }

        int contHomens = 0;
        for (int i = 0; i < N; i++) {
            if (genero[i] == 'M') {
                contHomens++;
            }
        }
        System.out.println("Numero de homens: "+  contHomens);

        sc.close();




    }
}


