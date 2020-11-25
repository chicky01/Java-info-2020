package ComplementariosL1;
import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        char letra = scan.next().charAt(0); 
        
        System.out.println(contadorLetras(texto, letra));

        scan.close();
    }

    public static int contadorLetras(String texto, char letra){
        int cont = 0;
        int pos = texto.indexOf(letra);
        
        while (pos != -1){
            pos = texto.indexOf(letra, pos + 1);
            cont++;
        }

        return cont;
    }
}
