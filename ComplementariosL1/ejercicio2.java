package ComplementariosL1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = scan.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));

        scan.close();
    }
}
