package Lista8;
/*Faça um programa para imprimir: 
    1 
    2	2 
    3	3   3 
    ..... 
    n   n   n   n   n   n  ... n  
para um n informado pelo usuário.  
Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.*/
import java.util.Scanner;
public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de n: ");
        int n = scanner.nextInt(); 
        
        imprimirNInt(n);
      scanner.close();  
    }
        public static void imprimirNInt(int n) {  
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(i + " ");
                }System.out.println();
            }            
        }
}