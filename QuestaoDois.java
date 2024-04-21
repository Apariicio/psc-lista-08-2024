package Lista8;
/*Faça um programa para imprimir: 
    1 
    1	2 
    1	2   3
    1   2   3   4
    ..... 
    n   n   n   n   n   n  ... n  
para um n informado pelo usuário.  
Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.*/
import java.util.Scanner;
public class QuestaoDois {
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
                    System.out.print(j + " ");
                }System.out.println();
            }            
        }
}