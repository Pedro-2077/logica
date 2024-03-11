package Academy.devedojo.lacosderepericao.fors;
import  java.util.Scanner;

public class Aula41 {
    public static void main(String[] args) {
         int [][] mult = new int[2][3];
//         mult[0][0] = 33;
//         mult[0][1] = 25;
//         mult[1][0] = 10;
//         mult[1][1] = 19;

        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                System.out.println("Digite a posição ["+i+"]"+"["+j+"]:");
                mult [i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) { // Ele ta pedindo pra da o tamanho que a posição zero esta referenciado que no caso essa referencia é o for logo acima mult.lenght
                // e o  i significa o valor total do j
                System.out.println("As posições ["+i+"]"+"["+j+"]:"+mult[i][j]);

            }
        }
    }
}
