
package practicafibonacci;
import java.util.Scanner;

public class PracticaFibonacci {

    
    public static void main(String[] args) {
       Scanner lectura = new Scanner (System.in);
       int x = 0, y = 1, z, dato;
        System.out.println("Ingrese la cantidad de elementos para la serie: ");
        dato= lectura.nextInt();
        for (int i=0; i<dato ;i++){
            System.out.println(x);
            z = x + y;
            x = y;
            y = z;
        }
    }
    
}
