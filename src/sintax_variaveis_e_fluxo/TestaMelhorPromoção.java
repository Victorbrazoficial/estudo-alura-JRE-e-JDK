/* 
    4- Uma livraria está fazendo uma promoção para pagamento á vista em que o comprador
    pode escolher entre dois criterios de desconto:
    Criterio A: R$0,25 por livro + R$7,50 fixo.
    Criterio B: R$0,50 por livro + R$2,50 fixo.
    Faça um Programa em que o usuário digite a quantidade de livros que deseja comprar
    e o programa diga qual é a melhor opção de desconto.
*/
package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaMelhorPromoção {
    
    public static void main(String[] args) {
        
        double criterioA = 7.50;
        double criterioB = 2.50;
        int numeroDeLivros;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos livros você vai levar?");
        numeroDeLivros = entrada.nextInt();

        //System.out.println("Valores Criterio A:");

        for (int contador = 1; contador <= numeroDeLivros ; contador++) {
            criterioA += 0.25;
            //System.out.println(criterioA + " contador: " + contador);
        }

        System.out.println();
        //System.out.println("Valores Criterio B:");

        for (int contador = 1; contador <= numeroDeLivros; contador++ ) {
            criterioB += 0.50;
            //System.out.println(criterioB + " contador: " + contador);
        }

        if (criterioA > criterioB) { 

            System.out.println("O melhor desconto para você é o Criterio B.");
            System.out.println("Criterio B: R$0,50 por livro + R$2,50 fixo.");
            System.out.println("Valor total da compra: R$ " + criterioB);
            System.out.println("Criterio A: R$" + criterioA);
            System.out.println("Criterio B: R$" + criterioB);

        } else { 

            if (criterioA == criterioB) {

                System.out.println("Tanto no criterio A quanto no B os valores são iguais.");
                System.out.println("Criterio A: R$" + criterioA);
                System.out.println("Criterio B: R$" + criterioB);

            } else {

                System.out.println("O melhor desconto para você é o Criterio A.");
                System.out.println("Criterio A: R$0,25 por livro + R$7,50 fixo.");
                System.out.println("Valor total da compra: R$" + criterioA);
                System.out.println("Criterio A: R$" + criterioA);
                System.out.println("Criterio B: R$" + criterioB);
            }
        }
    }
}