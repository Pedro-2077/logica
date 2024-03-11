package Academy.devedojo.estruturascondicionais.switchcase;

import java.util.Scanner;
public class Aula24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o dia da semana: ");
//        int dia = teclado.nextInt();
//        System.out.println("Digite o mês da semana: ");
//        int mes = teclado.nextInt();
//        System.out.println("Digite o ano da semana: ");
//        int ano= teclado.nextInt();
//        System.out.println("O dia e o mes da semana é: "+dia+"/"+mes+"/"+ano);

          System.out.println("Digite o dia da semana:");
          int dia = teclado.nextInt();
          switch (dia){
              case 1 :
                  System.out.println("Domingo");
                  break;
              case 2:
                  System.out.println("Segunda");
                  break;
              case 3:
                  System.out.println("Terça");
                  break;
              case 4:
                  System.out.println("Quarta");
                  break;
              case 5:
                  System.out.println("Quinta");
                  break;
              case 6:
                  System.out.println("Sexta");
                  break;
              case 7:
                  System.out.println("Sabado");
                  break;
              default:
                  System.out.println("Dia não encontrado");
                  break;
          }
    }
}
