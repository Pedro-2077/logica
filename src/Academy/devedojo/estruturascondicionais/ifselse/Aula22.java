package Academy.devedojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class Aula22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Nome de usuario: ");
        String nome = teclado.next();


        if (nome.equals(null) || nome.equals ("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            //nome.equalsIgnoreCase("admin") serve parac comparar mesmo que for escrito maiusculo o minusculo independente da posição
            System.out.println("Usuario Invalido");
        }
        else{
            System.out.println(nome+" Cadastrado com sucesso");
        }


    }
}
