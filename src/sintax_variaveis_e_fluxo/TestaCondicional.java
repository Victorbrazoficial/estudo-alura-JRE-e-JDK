package sintax_variaveis_e_fluxo;

public class TestaCondicional {
    public static void main(String[] args) {

        System.out.println("Testando condicionais.");
        
        int idade = 16;
        int quantidadePessoa = 1;

        if (idade >= 18) {

            System.out.println("Você é maior de 18, pode entrar.");
        } else {

            if (quantidadePessoa >= 2) {

                System.out.println("Sua idade é menor que 18, mas voce pode entrar porque esta acompanhado.");
            } else {

                System.out.println("Voce não pode entrar pois sua idade é menor que 18 e voce não esta acompanhado.");
            }
        }    
    }
}