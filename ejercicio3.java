import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int cont = 1;

        while (cont == 1){

            int cal = test.nextInt();

            if(cal >= 0 && cal <= 59){
                System.out.println("Desaprobado");
            }
            else if(cal >= 60 && cal <= 74){
                System.out.println("Bueno");
            }
            else if(cal >= 75 && cal <= 84){
                System.out.println("Distinguido");
            }
            else if(cal >= 85 && cal <= 92){
                System.out.println("Sobresaliente");
            }
            else if(cal >= 93 && cal <= 100){
                System.out.println("Excelente");
            }
            else{
                System.out.println("Número inválido");
            }

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = test.nextInt();
        }

        test.close();

    }
}