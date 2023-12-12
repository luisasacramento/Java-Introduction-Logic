package estruturas_condicionais.beecrowd;

import java.util.Scanner;

public class bee_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1 = sc.nextFloat();//2
        float nota2 = sc.nextFloat();//3
        float nota3 = sc.nextFloat();//4
        float nota4 = sc.nextFloat();//1

        float media =  (nota1 * 2f + nota2 *3f + nota3 *4f + nota4 * 1) / 10f;

        System.out.printf("Media: %.1f%n ", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado");

        }else{
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            float mediaFinal = (notaExame + media) / 2f;
            if (mediaFinal >= 5.0){
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final:  %.1f%n", mediaFinal);
        }
    }
}
