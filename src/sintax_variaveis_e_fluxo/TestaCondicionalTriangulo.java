package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaCondicionalTriangulo {
    
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite valor de a:");
        a = entrada.nextInt();
        System.out.println("Digite valor de b:");
        b = entrada.nextInt();
        System.out.println("Digite valor de c:");
        c = entrada.nextInt();

        if ((a != 0) && (b != 0) && (c != 0)) {

            if ((a + b >= c) && (a + c >= b) && (b + c >= a)) {

                if ((a != b) && (a != c) && (b != c)) {

                    System.out.println("Triangulo escaleno: Tres lados diferentes.");
                    System.out.println(a + " " + b + " " + c);

                } else {
                    if ((a == b) && (b == c)) {

                        System.out.println("Triangulo equilatero: Tres lados iguais.");
                        System.out.println(a + " " + b + " " + c);

                    } else {

                        System.out.println("Triangulo isosceles: Dois lados iguais.");
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            } else {

                System.out.println("Não é um triangulo. (1)");
            }
        } else {

            System.out.println("Não é um triangulo. (2)");
        }
    }
}