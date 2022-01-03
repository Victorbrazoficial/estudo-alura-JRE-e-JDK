package sintax_variaveis_e_fluxo;

public class TestaSomatoria {
    
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            System.out.println("Contador: " + contador + " + Total: " + total);
            total = total + contador;
            System.out.println("---------,");
            System.out.println("Total: " + total);
            System.out.println("---------'");
            contador++;
        }
        System.out.println("Valor total final: " + total);
    }
}