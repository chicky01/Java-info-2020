import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nro;
        int cont = 1;

        while(cont == 1){
            System.out.println("Ingrese un número:");
            nro = scan.nextInt();

            System.out.println("El número ingresado es: " + nro);

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = scan.nextInt();
        }

        scan.close();
    }
}
