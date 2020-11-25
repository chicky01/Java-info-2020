package ComplementariosL1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;

        while(num > 0){
            fact = fact*num;
            num-=1;
        }

        System.out.println(fact);

        scan.close();

    }
}

