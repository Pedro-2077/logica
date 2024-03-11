package Academy.devedojo.estruturascondicionais.ifselse;

public class Aula15 {
    public static void main(String[] args) {
        float salario = 4200.50f;
        float resultado;
        String validacao;

        if(salario>4500){
            resultado = salario*0.3f;
            System.out.println(resultado);
            validacao="É trinta porcento";
        }
        else{
            resultado = salario*0.15f;
            System.out.println(resultado);
            validacao="É quinze porcento";
        }

        System.out.println(validacao);

    }
}
