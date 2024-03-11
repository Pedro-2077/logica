package Academy.devedojo.lacosderepericao.whiles;
import java.util.Scanner;
public class Aula32 {
    public static void main(String[] args) {

        String opocao;

        Scanner teclado = new Scanner(System.in);

        do {
        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        System.out.println("Digite outro numero:");
        int numero2 = teclado.nextInt();

            if( numero2 == numero){
                System.out.println("numero igual");
            }
            else{
                System.out.println("numeros diferentes");
            }
            System.out.println("-------------------------------------------------");
            System.out.println("Deseja continuar: ");
            opocao = teclado.next();
        }while(opocao.equalsIgnoreCase("sim") || opocao.equalsIgnoreCase("s"));

    }

}

