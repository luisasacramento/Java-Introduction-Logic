package extras;



import java.util.Scanner;

public class matematica1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.println("Diga o primeiro número");
        num1 = sc.nextDouble();

        System.out.println("Diga o segundo número");
        num2 = sc.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;

        System.out.println("A SOMA dos números é: " + soma);
        System.out.println("A SUBTRAÇÃO dos números é: " + sub);
        System.out.println("A MULTIPLICAÇÃO dos números é: " + multi);
        System.out.println("A DIVISÃO dos números é: " + div);

        sc.close();
    }
}
