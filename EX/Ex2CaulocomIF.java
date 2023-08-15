import java.util.Scanner;
public class Ex2CaulocomIF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        
        double conta = 50;
        
        if (minutos >100){
            conta +=(minutos - 100) *2;
        }
        System.out.printf("Você vai pagar %s em sua conta: ", conta);
    }    
}
