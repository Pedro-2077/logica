package Academy.devedojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite  a sua idade: ");
        int idade = teclado.nextInt();

        if ( idade <= 11 ){
            System.out.println(nome +" Você é uma criança");
        }
        else if ( idade>= 12 && idade <=15) {
            System.out.println(nome +" Você é uma pre adolecente");
        }
        else if ( idade >=16 && idade <=19 ) {
            System.out.println(nome+" Você é um adolecente");
        }
        else{
            System.out.println(nome+" Você é adulto");
        }


    }
}
