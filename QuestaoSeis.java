package Lista8;
/*Faça um programa que converta da notação de 24 horas para a notação de 12 horas
    Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros
    Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída
   Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M
    Assim, a função para efetuar as conversões terá um parâmetro formal para registrar
      se é A.M. ou P.M. Inclua um loop que permita que o usuário
       repita esse cálculo para novos valores de entrada todas as vezes que desejar */
import java.util.Scanner;
public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char cont = 's';
        while (cont=='s' || cont=='S') {
            System.out.print("Digite a hora no formato de 24 horas: ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos: ");
            int minutos = scanner.nextInt();
            String horaConvertida = converterAmPm(hora, minutos);
            exibirHoraCerta(horaConvertida);
            System.out.print("Deseja converter outro horário? s/n: ");
            cont = scanner.next().charAt(0);
        }
        scanner.close();
    }
    public static String converterAmPm(int hora, int minutos) {
        String saida;
        if (hora<12) {
            saida="A";
        }else {
            saida="P";
        }if (hora==0) {
            hora=12;
        }else if (hora>12) {
            hora-=12;
        }return hora + ":" + minutos + " " + saida + ".M.";
    }
    public static void exibirHoraCerta(String horaConvertida) {
        System.out.println("A hora certa convertida é: " + horaConvertida);
    }
}