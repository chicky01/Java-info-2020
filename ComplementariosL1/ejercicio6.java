package ComplementariosL1;
import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int exp = scan.nextInt();

        System.out.println(potencia(base, exp));


        scan.close();
    }

    public static int potencia(int base, int exp){
        int resultado = 1;

        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
