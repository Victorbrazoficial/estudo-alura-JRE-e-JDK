package sintax_variaveis_e_fluxo;

public class TesteCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais.");

        int idade = 16;
        int quantidadePessoas = 1;
        boolean acompanhado = quantidadePessoas >= 2;
        System.out.println("Idade: " + idade);
        System.out.println("está acompanhado?: " + acompanhado);

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja Bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}