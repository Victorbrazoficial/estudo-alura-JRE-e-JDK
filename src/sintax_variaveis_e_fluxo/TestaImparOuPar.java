package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaImparOuPar {
    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é Par.");
        } else {
            System.out.println(numero + " é impar.");
        }
    }
}