package Lista8;
/*Faça um programa, com uma função que necessite de três argumentos
     e que forneça a soma desses três argumentos. */
public class QuestaoTres {
    public static void main(String[] args) {
        int dia = 7;
        int mes = 4;
        int ano = 1987;
        

        imprimirsoma(dia, mes, ano);        
    }
    public static void imprimirsoma(int dia , int mes, int ano) {
        int soma = dia + mes + ano;
        System.out.print("A soma é: " + soma);              
    }
}