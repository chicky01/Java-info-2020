import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cont = 1;

        do{
            int nro = scan.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(nro + " x " + i + " = " + nro*i);
            }

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = scan.nextInt();
        }
        while (cont == 1);

        scan.close();
    }
}
