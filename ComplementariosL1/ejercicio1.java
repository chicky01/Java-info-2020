package ComplementariosL1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un nombre de usuario: ");
        
        String nom = scan.nextLine();
        System.out.println("HOLA " + nom);

        scan.close();
    }
}