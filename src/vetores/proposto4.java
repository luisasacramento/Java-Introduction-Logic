package vetores;

import java.util.Scanner;

public class proposto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] nums = new double[N];

        for (int i=0; i<N; i++) {
            nums[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < N; i++){
            soma = soma + nums[i];
        }
        double media = soma /N;
        System.out.println(media);

        for (int i =0; i < N; i++){
            if (nums[i] < media){
                System.out.println(nums[i]);
            }
        }



    }
}
