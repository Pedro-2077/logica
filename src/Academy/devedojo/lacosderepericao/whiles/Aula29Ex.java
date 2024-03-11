package Academy.devedojo.lacosderepericao.whiles;
import java.util.Scanner;
public class Aula29Ex {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        int i = 0;

        while (i <= numero){
            if(i % 2 != 0){
                System.out.println("O numero "+i+" é impar");
            }
            i++;
        }

        }
    }

