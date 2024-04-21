package Lista8;
/*Faça um programa, com uma função que necessite de um argumento
 A função retorna o valor de caractere ‘P’, se seu argumento for positivo
 e ‘N’, se seu argumento for zero ou negativo*/
 import java.util.Scanner;
public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero real tanto negativo quanto positivo: ");  
        double nPouN = scanner.nextInt();
        System.out.println("O numero digitado " + nPouN + " é " + posineg(nPouN));    
        scanner.close();
    } 
    public static char posineg(double nPouN) {
        if(nPouN >0){
            return 'P';            
        }else{
            return 'N';
        }        
    }   
}