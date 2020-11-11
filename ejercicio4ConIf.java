import java.util.Scanner;

public class ejercicio4ConIf {
    public static void main(String[] args) {
        Scanner sem = new Scanner(System.in);
        int cont = 1;

        while (cont == 1){

            System.out.println("Ingrese un número del 1 al 7:");
            int dia = sem.nextInt();

            if(dia == 1){
                System.out.println("Domingo");
            }
            else if(dia == 2){
                System.out.println("Lunes");
            }
            else if(dia == 3){
                System.out.println("Martes");
            }
            else if(dia == 4){
                System.out.println("Miércoles");
            }
            else if(dia == 5){
                System.out.println("Jueves");
            }
            else if(dia == 6){
                System.out.println("Viernes");
            }
            else if(dia == 7){
                System.out.println("Sábado");
            }
            else{
                System.out.println("Número inválido");
            }

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = sem.nextInt();
        }

        sem.close();

    }
}
