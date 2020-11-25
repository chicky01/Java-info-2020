package ComplementariosL1;
import java.util.Scanner;

//Ver como funciona y modificar (agregar Scanner)

public class ejercicio7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();

        System.out.println(mayuscula(cadena));

        scan.close();
    
    }

    public static String mayuscula(String s){

        String texto = "";

        for(int x = 0; x < s.length(); x++){
            char ch = s.charAt(x);

            if(ch >= 'a' && ch <= 'z')
                texto += "" + (char)(ch - 32);
            else
                texto += "" + ch; 
        }
        return texto;
    }
}
