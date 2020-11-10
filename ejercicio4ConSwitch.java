import java.util.Scanner;

public class ejercicio4ConSwitch {
    public static void main(String[] args) {
        Scanner sem = new Scanner(System.in);
        int cont = 1;

        while(cont == 1){
            int dia = sem.nextInt();

            switch (dia){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miércoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }

            System.out.println("Si desea continuar presione 1, sino presione otro número");
            cont = sem.nextInt();
        }

        sem.close();
    } 
}
