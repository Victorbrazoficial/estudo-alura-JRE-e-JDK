package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaAprovadoOuReprovado {
    public static void main(String[] args) {

        double media, mediaFinal, prova1, prova2, prova3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos pontos vc tirou na prova 01");
        prova1 = entrada.nextDouble();
        System.out.println("Digite quantos pontos vc tirou na prova 02");
        prova2 = entrada.nextDouble();
        System.out.println("Digite quantos pontos vc tirou na prova 03");
        prova3 = entrada.nextDouble();
        media = (prova1 + prova2 + prova3) / 3;

        if (media < 7.0) {

            System.out.println("Sua media foi de " + media + ", precisava ficar com 7,0 por isso vc ficou de exame.");
            System.out.println("Digite quanto vc tirou no exame:");
            double exame = entrada.nextDouble();
            mediaFinal = (media + exame) / 2;

            if (mediaFinal < 5) {

                System.out.println("Sua nota do exame foi de " + exame);
                System.out.println(
                        "Sua media final foi de " + mediaFinal + ", você precisava de 5,0 por isso vc foi reprovado.");
            } else {

                System.out.println("Você ficou com media final de " + mediaFinal
                        + ", precisava ficar com 5,0 por isso você foi aprovado");
            }

        } else {

            System.out.println(
                    "Você ficou com media de " + media + ", precisava ficar com 7,0, por isso você foi aprovado");
        }
    }
}