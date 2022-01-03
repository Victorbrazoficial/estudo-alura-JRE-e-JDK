package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaMultiplosDeTresEdeSete {

    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 7 == 0) {

            System.out.println(numero + " é multiplo de 3 e 7");

        } else {
            if (numero % 3 == 0) {

                System.out.println(numero + " é multiplo de 3");

            } else {
                if (numero % 7 == 0) {

                    System.out.println(numero + " é multiplo de 7");

                } else {

                    System.out.println(numero + " não é multiplo de 3 nem de 7");
                }
            }
        }
    }
}