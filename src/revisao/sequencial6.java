package revisao;

import java.util.Scanner;

public class sequencial6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo =  a * c/2.0;
        circulo = c * c * 3.14159;
        trapezio = (a + b)/2.0 * c;
        quadrado = b *b ;
        retangulo = a *b;

        System.out.println(" TRIANGULO : " + triangulo);
        System.out.println(" CIRCULO : " + circulo);
        System.out.println(" TRAPEZIO : " + trapezio);
        System.out.println(" QUADRADO : " + quadrado);
        System.out.println(" RETANGULO : " + retangulo);

        sc.close();


    }

}
