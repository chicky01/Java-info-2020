package ComplementariosL1;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        int edad = scan.nextInt();
        String saltoDeLinea = scan.nextLine();
        String direc = scan.nextLine();
        String ciudad = scan.nextLine();

        System.out.println(ciudad + " - " + direc + " - " + edad + " - " + nombre);

        scan.close();
    }
}
