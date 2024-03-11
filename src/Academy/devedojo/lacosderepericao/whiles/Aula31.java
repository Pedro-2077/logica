package Academy.devedojo.lacosderepericao.whiles;
import java.util.Scanner;
public class Aula31 {
    public static void main(String[] args) {

        final int senha = 10;
        final String login = "Pedro";
        boolean exibirTela = true;

        while(exibirTela) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite seu Login: ");
            String loginDitado = teclado.next();
            System.out.println("Digite sua senha: ");
            int senhaDigitado = teclado.nextInt();

            if (login.equals(loginDitado) && senha == senhaDigitado){
                System.out.println("Acesso concedido");
                exibirTela = false;
            }else{
                System.out.println("Acesso negado");
            }
        }

    }
}
