package Academy.devedojo.lacosderepericao.fors;
import java.util.Scanner;
public class Aula42Ex {
    public static void main(String[] args) {

        int [][] matrizA = new int [4][4];
        int calculoMatrizA = 1;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matrizA.length ; i++) {
            for (int j = 0; j < matrizA[i].length ; j++) {
                System.out.println("Digite a matriz ["+i+"]["+j+"]: ");
                matrizA[i][j] = teclado.nextInt();
                if (i==j){
                    calculoMatrizA = calculoMatrizA * matrizA[i][j];
                }
            }
        }
        for (int i = 0; i < matrizA.length ; i++) {
            for (int j = 0; j < matrizA[i].length ; j++) {
                System.out.println("Digite a matriz ["+i+"]["+j+"]: "+matrizA[i][j]);
            }
        }
        System.out.println("O calculo é:"+calculoMatrizA);
    }
}
