package Academy.devedojo.lacosderepericao.fors;
import java.util.Scanner;

public class Aula34Ex {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
//        for(int i = 15; i<=200; i++){
//            System.out.println(i+"x"+i+"="+i*i );
//        }
        System.out.println("Digite um numero: ");
        int num = teclado.nextInt();
        for (int i = 0; i <=10 ; i++) {

            System.out.println("\n"+num+"x"+i+"="+num*i);
        }
    }
}
