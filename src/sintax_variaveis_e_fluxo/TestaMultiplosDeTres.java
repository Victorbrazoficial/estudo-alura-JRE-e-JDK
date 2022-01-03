package sintax_variaveis_e_fluxo;

public class TestaMultiplosDeTres {
    public static void main(String[] args) {
        int multiplosDeTres = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                multiplosDeTres = numero;
                System.out.println(multiplosDeTres);
            }
        }
    }
}