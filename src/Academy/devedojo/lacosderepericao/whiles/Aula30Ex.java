package Academy.devedojo.lacosderepericao.whiles;
import java.util.Scanner;
public class Aula30Ex {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 1;

        while(opcao == 1 || opcao == 2 ){
            System.out.println("Digite a opção a baixo:\n");
            System.out.println("1. Calcular imposto ");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("\nR: ");
            opcao = teclado.nextInt();
        }
    }
}
