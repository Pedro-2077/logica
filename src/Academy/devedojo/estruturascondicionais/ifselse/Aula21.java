package Academy.devedojo.estruturascondicionais.ifselse;

public class Aula21 {
    public static void main(String[] args) {

        String nome = null ; // Null Siginifica vazio

        if( nome == null || nome == "" ){
            System.out.println("Nome não digitado");
        }
        else {
            System.out.println("Nome digitado");
        }

    }
}
