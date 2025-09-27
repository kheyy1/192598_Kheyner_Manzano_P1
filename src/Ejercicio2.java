import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esInvalido = true;
        double notaA = 0;
        double notaB = 0;
        double notaC = 0;
        while (esInvalido) {
            System.out.println("Ingrese su primera nota");
            if (sc.hasNextDouble()) {
                notaA = sc.nextDouble();
                if (notaA < 0 || notaA > 10) {
                    System.out.println("La nota debe estar en el rango [0,10]");
                    sc.nextLine();
                } else {
                    esInvalido = false;
                }
            } else {
                System.out.println("Dato invalido debe ser un numero");
                sc.nextLine();
            }
        }
        esInvalido = true;
        while (esInvalido) {

            System.out.println("Ingrese su segunda nota");
            if (sc.hasNextDouble()) {
                notaB = sc.nextDouble();
                if (notaB < 0 || notaB > 10) {
                    System.out.println("La nota debe esatr en el rango [0,10]");
                    sc.nextLine();
                } else {
                    esInvalido = false;
                }
            } else {
                System.out.println("Dato invalido debe ser un numero");
                sc.nextLine();
            }
        }
        esInvalido = true;
        while (esInvalido) {
            System.out.println("Ingrese su tercera nota");
            if (sc.hasNextDouble()) {
                notaC = sc.nextDouble();
                if (notaC < 0 || notaC > 10) {
                    System.out.println("La nota debe esatr en el rango [0,10]");
                    sc.nextLine();
                } else {
                    esInvalido = false;
                }
            } else {
                System.out.println("Dato invalido debe ser un numero");
                sc.nextLine();
            }
        }
        double promedio = (notaA + notaB + notaC) / 3;
        if (promedio >= 7) {
            System.out.println("Promedio: " + promedio + "\n" + "Estado: Promocionado");
        } else if (promedio >= 4 && promedio < 7) {
            System.out.println("Promedio: " + promedio + "\n" + "Estado: Regular");
        } else {
            System.out.println("Promedio: " + promedio + "\n" + "Estado: Reprobado");
        }
        sc.close();
    }
}
