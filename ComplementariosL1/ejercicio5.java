package ComplementariosL1;
import java.util.Scanner;

public class ejercicio5 {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n1 = scan.nextInt();
       int n2 = scan.nextInt();
       
       System.out.println(n1 + " x " + n2 + " = " + (n1*n2));

       scan.close();
   } 
}