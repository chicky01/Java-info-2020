import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int cont = 1;

        while (cont == 1) {
            System.out.println("Ingrese el primer número:");
            int n1 = numScan.nextInt();
            System.out.println("Ingrese el segundo número:");
            int n2 = numScan.nextInt();
            System.out.println("Ingrese el último número:");
            int n3 = numScan.nextInt();
            
            System.out.println("Primer Número: " + n1);
            System.out.println("Segundo Número: " + n2);
            System.out.println("Tercer Número: " + n3);

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = numScan.nextInt();
        }
        
        numScan.close();
    }
}
