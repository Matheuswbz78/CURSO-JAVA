
import java.util.Scanner;

public class Ex4_Senhas_com_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha_valida = 2002;
        int senha = sc.nextInt();

        while (senha != senha_valida) {
            System.out.println("Acesso Negado! ");
            System.out.println("Digite a senha novamente: ");
            senha = sc.nextInt();
            
            if (senha == senha_valida) {
                System.out.println("Acesso Permitido! ");
            }
        }
    }

}
