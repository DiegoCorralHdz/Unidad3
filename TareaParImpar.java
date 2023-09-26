
package tareaparimpar;
import java.util.Scanner;
public class TareaParImpar {

    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        System.out.println("ingrese el numero: ");
        int n= numero.nextInt();
        boolean esPar = n%2 == 0;
        
       if(esPar){
           System.out.println("El numeero es par");
       } else{
           System.out.println("El numero no es par");
       }
        
    }
    
}
