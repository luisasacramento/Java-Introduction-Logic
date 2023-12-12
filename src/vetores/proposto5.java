package vetores;

import java.util.Scanner;

public class proposto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet = new double[N];

        for (int i =0; i < N; i++){
            vet[i] = sc.nextInt();
        }

        double somaPares =0;
        int qtdePares =0;
        for (int i =0; i < N; i++){
            if (vet[i]% 2==0){

                somaPares = somaPares + vet[i];
                qtdePares++;
            }
        }
        if (qtdePares == 0) {
            System.out.println("Nao havia nenhum numero par");
        }else {
            double media = somaPares/qtdePares;
            System.out.println(media);

        }

      sc.close();
    }
}
