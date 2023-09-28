package cajeroautomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        int saldo = 4000;
        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es : " + saldo);
                break;

            case 2:
                System.out.println("Ingrese la cantidad del deposito: ");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println("Deposito concluido, Su saldo actual es : " + saldo);
                } else {
                    System.out.println("Cantidad no valida, Ingrese una cantidad posible");
                }
                break;
            case 3:
                System.out.println("Ingrese la cantidaad a retirar: ");
                double retiro = scanner.nextDouble();
                if (retiro > 0 && retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso, Su saldo actual es: " + saldo);
                } else {
                    System.out.println("Cantidad no valida o saldo insuficiente");

                }
                break;
            case 4:
                System.out.println("Opcion no valida, Seleccione una opcion valida");
                scanner.close();
            default:
                System.out.println("Opcion valida, seleccione una opcion valida");
        }
    }

}
