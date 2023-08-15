import java.util.Scanner;
public class Ex3_Dias_da_Semana {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x == 1){
            System.out.println("Bom Domingo!");
        
        } else if (x == 2){
            System.out.println("Boa Segunda!");
        } else if (x == 3){
            System.out.println("Boa Terca!");
        }else if (x == 4){
            System.out.println("Boa Quarta!");
        }else if (x == 5){
            System.out.println("Boa Quinta!");
        }else if (x == 6){
            System.out.println("Boa Sexta!");
        }else if (x == 7){
            System.out.println("Bom Sabado!");
        }
        else if (x >7){
            System.out.println("Não existe esse dia!");
        }
        }
    }
    

