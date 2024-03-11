package Academy.devedojo.estruturascondicionais.switchcase;
import java.util.Scanner;

public class Aula27Ex {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual tipo é a sua conta 1(POUPANÇA) 2(CORRENTE) 3(INVESTIMENTO): ");
        int opcao = teclado.nextInt();

        switch(opcao){

            case 1:
                System.out.println("A porcentagem de juros é 0.05%" );
                break;
            case 2:
                System.out.println("A porcentagem de juros é 0.02% ");
                break;
            case 3:
                System.out.println("A porcentagem de juros é 0.1% ");
                break;
            default:
                System.out.println("Digito Inválido");
                break;
        }
    }
}
