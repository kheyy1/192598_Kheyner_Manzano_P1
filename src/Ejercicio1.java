import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esInvalido = true;
        double numeroX = 0;
        double numeroY = 0;
        while (esInvalido) { //Bucle que se repite hasta que se ingrese un dato valido
            System.out.println("Ingrese su primer número");
            if (sc.hasNextDouble()) { //Validar que sea double
                numeroX = sc.nextDouble();
                esInvalido = false; //Terminar el bucle
            } else {
                System.out.println("Dato invalido debe ser un numero");
                sc.nextLine();
            }
        }
        esInvalido = true;
        while (esInvalido) {
            System.out.println("Ingrese su segundo número");
            if (sc.hasNextDouble()) {
                numeroY = sc.nextDouble();
                esInvalido = false;
            } else {
                System.out.println("Dato invalido debe ser un numero");
                sc.nextLine(); //Limpiando el buffer
            }
        }
        if (numeroX >= numeroY) { //Una serie de condicionales para mostrar los distintos casos
            double suma = numeroX + numeroY;
            System.out.println("Suma = " + suma);
            double resta = numeroX - numeroY;
            System.out.println("Diferencia = " + resta);
        } else if (numeroX < numeroY) {
            double Producto = numeroX * numeroY;
            System.out.println("Producto = " + Producto);
            if (numeroY == 0) { //Validacion a la division entre 0
                System.out.println("No se puede dividir entre 0");
            } else {
                double Division = numeroX / numeroY;
                System.out.println("Division = " + Division);
            }
        }
        sc.close();
    }
}
