import java.util.Scanner;
public class exercicio_desafio {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Quantos cigarros você fuma por dia? ");
       int qtde_cigarros_dia = sc.nextInt();

       System.out.println("Há quantos anos você fuma/fumou? ");
       int anos = sc.nextInt();

       int cigarros_total = qtde_cigarros_dia * anos * 365;
       int tempo_perdido = (cigarros_total * 10) / (60*24);

       System.out.println("Você perdeu, aproximadamente, " + tempo_perdido + " dias de vida.");

       sc.close();


    }

}
