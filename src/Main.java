import java.util.Scanner;

// Programa que calcule la conversion de dolares a pesos
public class Main {
    public static void main(String[] args) {
        // Identificar tasa del dolar
        final double TASA_DOLAR = 56.23;
        double monto;
        double total;
        String usuario;
        Scanner scanner = new Scanner(System.in);


        System.out.print ("Ingrese su nombre: ");
        usuario = scanner.nextLine();

        System.out.println("Ingrese el monto en dolares");
        monto = scanner.nextDouble();

        total = TASA_DOLAR * monto;
        System.out.println("La conversion del monto en dolares en pesos es: RD $ "+ total);
    }

}
