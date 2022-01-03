package sintax_variaveis_e_fluxo;

public class TestaLacos {

    public static void main(String[] args) {

        int fator1;
        int fator2 = 0;
        int resultado = 0;

        for (fator1 = 0; fator1 <= 9; fator1++) {

            System.out.println("----");
            for (fator2 = 0; fator2 <= 9; fator2++) {
                resultado = fator1 * fator2;
                System.out.println(fator1 + "x" + fator2 + "=" + resultado);
            }
        }
    }
}