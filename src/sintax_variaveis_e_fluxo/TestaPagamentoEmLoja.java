/* 
    5- Considere a situação em que um cliente faz uma determinada compra em uma loja.
    Ao realizar o pagamento, são são-lhe oferecidas as seguintes condições para pagamento:
    Pagamento a vista 15% de desconto sobre o valor da total compra.
    Pagamento com cheque pre-datado, 10% de desconto sobre o valor da total compra.
    Pagamento parcelado em 3x, 5% de desconto sobre o valor da total compra.
    Pagamento parcelado em 6x, não tem desconto.
    Pagamento parcelado em 12x, 8% de acrescimo sobre o valor da total compra.
    De acordo com o valor total da compra, verifique a opção de pagamento do cliente,
    calcule o valor final da compra e, se a for por pagamento parcelado, calcule as parcelas.
    Apresente ao usuario uma mensagem com o valor total da compra, o valor final da compra,
    a diferença entre os dois, identifique como desconto se a diferença for positiva, 
    como juros se for negativa, mostre também a quantidade e o valor das parcelas. 
*/
package sintax_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaPagamentoEmLoja {

    public static void main(String[] args) {
       
        int opcaoDoCliente;
        double valorTotalDaCompra = 100;
        double valorFinalDaCompra, valorDasParcelas;

        Scanner entrada = new Scanner(System.in);
        opcao();
        opcaoDoCliente = entrada.nextInt();

        switch (opcaoDoCliente) {

            case 1: 
                    valorFinalDaCompra = valorTotalDaCompra - (valorTotalDaCompra * 0.15);
                    
                    if (valorTotalDaCompra - valorFinalDaCompra > 0) {

                        System.out.println("Você escolheu pagamento a vista, desconto de 15%");
                        System.out.println("valor total: " + valorTotalDaCompra);
                        System.out.println("Valor final: " + valorFinalDaCompra);

                    } else {

                        System.out.println("Confere pq case 1 ta errado.");
                    }
            break;

            case 2: 
                    valorFinalDaCompra = valorTotalDaCompra - (valorTotalDaCompra * 0.10);   
                    
                    if (valorTotalDaCompra - valorFinalDaCompra > 0) {

                        System.out.println("Você escolheu cheque pré-datado, desconto de 10%");
                        System.out.println("valor total: " + valorTotalDaCompra);
                        System.out.println("Valor final: " + valorFinalDaCompra);

                    } else {

                        System.out.println("Confere pq case 2 ta errado.");
                    }
            break;

            case 3: 
                    valorFinalDaCompra = valorTotalDaCompra - (valorTotalDaCompra * 0.05);
                    valorDasParcelas = (valorFinalDaCompra/3);
                    
                    if (valorTotalDaCompra - valorFinalDaCompra > 0) {

                        System.out.println("Você escolheu parcelar de 3x, desconto de 5%");
                        System.out.println("valor total: " + valorTotalDaCompra);
                        System.out.println("Valor final: " + valorFinalDaCompra);
                        System.out.println("Valor das parcelas: " + valorDasParcelas);

                    } else {

                        System.out.println("Confere pq case 3 ta errado.");
                    }
            break; 
            
            case 4:
                    valorFinalDaCompra = valorTotalDaCompra;
                    valorDasParcelas = (valorFinalDaCompra/6);
                    
                    if (valorTotalDaCompra - valorFinalDaCompra == 0) {

                        System.out.println("Você escolheu , parcelar de 6x, desconto de 0%");
                        System.out.println("valor total: " + valorTotalDaCompra);
                        System.out.println("Valor final: " + valorFinalDaCompra);
                        System.out.println("Valor das parcelas: " + valorDasParcelas);

                    } else {

                        System.out.println("Confere pq case 4 ta errado.");
                    }
            break;        

            case 5: 
                    valorFinalDaCompra = valorTotalDaCompra + (valorTotalDaCompra * 0.08);
                    valorDasParcelas = (valorFinalDaCompra/12);

                    if (valorTotalDaCompra - valorFinalDaCompra < 0) {

                        System.out.println("Você escolheu , parcelar de 12x, acrescimo de 8%");
                        System.out.println("valor total: " + valorTotalDaCompra);
                        System.out.println("Valor final: " + valorFinalDaCompra);
                        System.out.println("Valor das parcelas: " + valorDasParcelas);

                    } else {

                        System.out.println("Confere pq case 5 ta errado.");
                    }
            break;        
        }
    }

    public static void opcao() {
        System.out.println("========");
        System.out.println("OPÇÕES DE PAGAMENTO");
        System.out.println("========");
        System.out.println("1- Pagamento a Vista (15% de desconto)");
        System.out.println("2- Cheque pré-datado (10% de desconto)");
        System.out.println("3- Parcelado em 3X   (5% de desconto)");
        System.out.println("4- Parcelado em 6X   (0% de desconto)");
        System.out.println("5- Parcelado em 12X  (8% de acrescimo)");
        System.out.println("========");
        System.out.println("Qual sera sua opção de pagamento? (digite um numero)");
    }  
}