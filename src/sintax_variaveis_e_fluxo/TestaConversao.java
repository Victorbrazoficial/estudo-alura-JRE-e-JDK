package sintax_variaveis_e_fluxo;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 2700.50;
        System.out.println(salario);

        int valor = (int) salario; // (int) se chama casting
        System.out.println(valor);
    }
}