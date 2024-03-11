package Academy.devedojo.estruturascondicionais.ifselse;

import java.util.Scanner;
public class Aula23 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite seu sexo");
        String sexo = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
    
        if ( sexo.equalsIgnoreCase("m") && idade >= 18){
            System.out.println("Alistamento Obrigatório");
        } else if ( sexo.equalsIgnoreCase("m") && idade <= 18) {
            System.out.println("Alistamento não Permitido");
        } else if ( sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Deseja se alistar");
        } else if ( sexo.equalsIgnoreCase("f") && idade <= 18) {
            System.out.println("Alistamento não permitido");
        }
    }
    
}
