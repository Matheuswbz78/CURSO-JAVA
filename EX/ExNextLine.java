
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mathe
 */

public class ExNextLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String s1, s2, s3;
      
      s1 = sc.nextLine();
      s2 = sc.nextLine();
      s3 = sc.nextLine();
      
      System.out.println("Aqui estão seus dados ");
      System.out.print(s1);
      System.out.print(s2);
      System.out.print(s3);

      
      sc.close();
    }
    
}
