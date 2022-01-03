package sintax_variaveis_e_fluxo;

public class TetaAliquotaComIfs {
    public static void main(String[] args) {
        double salario = 3700.01;
        double valorImposto;

        if (salario >= 1900 && salario <= 2800) {

            valorImposto = (salario * 7.5 / 100);
            System.out.println("IFs 7,5%");
            System.out.println("Valor do salrio: " + salario);
            System.out.println("Valor do imposto: " + valorImposto);

        } else if (salario >= 2800.01 && salario <= 3751.0) {

            valorImposto = (salario * 15.0 / 100);
            System.out.println("IFs 15,0%");
            System.out.println("Valor do salrio: " + salario);
            System.out.println("Valor do imposto: " + valorImposto);

        } else if (salario >= 3751.01 && salario <= 4664.0) {

            valorImposto = (salario * 22.5 / 100);
            System.out.println("IFs 22,5%");
            System.out.println("Valor do salrio: " + salario);
            System.out.println("Valor do imposto: " + valorImposto);
        }
    }
}