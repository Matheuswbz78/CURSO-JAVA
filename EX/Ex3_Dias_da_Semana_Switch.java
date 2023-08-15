import java.util.Scanner;
public class Ex3_Dias_da_Semana_Switch {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        
        switch (x){
            case 1:
                dia = "Domingod";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor Invalido! ";
                break;
        }
        System.out.println("O seu dia escolhido foi: " + dia);
        sc.close();
    }
    
}
