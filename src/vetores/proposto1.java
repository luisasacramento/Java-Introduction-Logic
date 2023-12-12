package vetores;

import java.util.Scanner;

public class proposto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet = new double[N];
        for (int i =0; i < N; i++){
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int posicao = 0;
        for (int i=0; i<N; i++){
            if(vet[i]> maior){
                maior = vet[i];
                posicao = i;
            }

            System.out.printf("%.1f%n", maior);
            System.out.println(posicao);

        }
        sc.close();

    }
}
