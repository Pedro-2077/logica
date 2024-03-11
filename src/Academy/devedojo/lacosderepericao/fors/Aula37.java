package Academy.devedojo.lacosderepericao.fors;
import java.util.Scanner;
public class Aula37 {
    public static void main(String[] args) {
        double [] notas = new double[4];
        double soma = 0;
        double total = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length ; i++) { // notas.lenght é o tamanho do array ou seja notas[4]
            System.out.println("Digite suas notas");
            notas[i] = teclado.nextDouble();
            soma = soma + notas[i];
        }
            total = soma / notas.length;
        System.out.println(total);
    }
}
