package Lista8;
/*Faça um programa com uma função chamada somaImposto
 A função possui dois parâmetros formais: taxaImposto
  que é a quantia de imposto sobre vendas expressa em porcentagem e custo
   que é o custo de um item antes do imposto
    A função “altera” o valor de custo para incluir o imposto sobre vendas */
import java.util.Scanner;
public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do prudto sem taxa de imposto: ");
        double semImposto = scanner.nextDouble();
        System.out.println("Digite a porcentagem da taxa: ");
        double taxaImp = scanner.nextDouble();
        double valorTotal = somaImposto(taxaImp, semImposto);
        System.out.println("O valor total com  taxa é " + valorTotal);
        scanner.close();              
    }
    public static double somaImposto(double taxaImp , double semImposto) {
        double imposto = semImposto*(taxaImp/100);
        return semImposto + imposto;               
    }    
}