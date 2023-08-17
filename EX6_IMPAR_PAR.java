import java.util.Scanner;
public class EX6_IMPAR_PAR {

    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       System.out.println("Digite um número: ");
       int x = Sc.nextInt();
       
       
       for (int i=0; i<=x; i++){
           if(i % 2 !=0){
               System.out.println("Resultado: " + i);
           }
       }
    }
    
}
