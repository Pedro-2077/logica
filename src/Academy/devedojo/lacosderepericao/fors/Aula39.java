package Academy.devedojo.lacosderepericao.fors;
import java.util.Scanner;

public class Aula39 {
    public static void main(String[] args) {

        int [] v1 = new int[10];
        int [] v2 = new int[10];

        Scanner teclado= new Scanner(System.in);
        for (int i = 1; i < v1.length; i++) {
            System.out.println("Digite a "+i+".Posição da V1: ");
            v1[i] = teclado.nextInt();

            System.out.println("Digite a "+i+".Posição da V2: ");
            v2[i] = teclado.nextInt();
        }

        for (int i = 1; i < v1.length; i++) {
            System.out.println(i+".Posições V1/V2: "+v1[i]+"x"+v2[i]+"="+v1[i]*v2[i]);
        }
    }
}
