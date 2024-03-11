package Academy.devedojo.estruturascondicionais.ifselse;

public class Aula18 {
    public static void main(String[] args) {

        String nome = "Pedro";
        int idade = 25;

        if(idade <= 10){
            System.out.println("Participara da categoria infantil");
        }
        else if (idade >= 11 && idade <=15) {
            System.out.println("Participara da categoria Juvenil");
        }
        else if (idade >= 16 && idade <= 19){
            System.out.println("Categoria Pre adulto");
        }
        else{
            System.out.println("Participara da categoria Adulto");
        }
    }
}
