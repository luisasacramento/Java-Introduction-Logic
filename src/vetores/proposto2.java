package vetores;

import java.util.Scanner;

public class proposto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i =0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++){
            if ( nums[i]% 2==0){
                System.out.println(nums[i]);
            }
        }

        int cont = 0;
        for (int i =0; i<N; i++){
            if ( nums[i]% 2==0){
                cont = cont + 1;
//                System.out.println(cont);
            }
//            System.out.println(cont);

        }
        System.out.println(cont);

    }
}
