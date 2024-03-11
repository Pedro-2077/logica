package Academy.devedojo.estruturascondicionais.ifselse;

public class OeradorTernario {
    public static void main(String[] args) {

        double salario = 3500;
        String mensagemV = "Voce pode passar";
        String mensagemF = "Voce não pode passar";
        String resultado = salario > 3000 ? mensagemV : mensagemF; // Tambem poderia ultilizar uma mensagem em string direto dentro das mensagemV e F

        System.out.println(resultado);

    }

}
