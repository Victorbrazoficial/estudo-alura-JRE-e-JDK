package sintax_variaveis_e_fluxo;

public class TestaFatorial {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 10; i++) {
            n *= i;
            System.out.println(n);
        }
    }
}