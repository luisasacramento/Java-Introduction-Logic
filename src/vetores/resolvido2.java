package vetores;

import java.util.Scanner;

public class resolvido2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//tamanho do vetor q eu quero ex: 4

        double[] vet = new double[N];
        for (int i =0; i < N; i++){//for para fazer a leitura do vetor/ pegar os numeros
            vet[i] = sc.nextDouble();// leitura dos elemento do vetro ex: (1,2,3,4) qtd de acordo com o int N
        }

        for (int i =0; i< N; i++){//for para imprimir o vetor na tela
            System.out.print(vet[i] + "");
        }
        System.out.println();

        double soma = 0.0;
        for(int i=0; i <N; i++){//for para calcular a soma dos elemetos do vetor
            soma = soma + vet[i];
        }

        System.out.printf("%.2f%n", soma);

        double media = soma /N;
        System.out.printf("%.2f%n",media);

        sc.close();




    }
}
