import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esInvalido = true;
        int[] valoresA = new int[5];
        int[] valoresB = new int[5];
        int[] valoresC = new int[5];
        for (int i = 0; i < 5; i++) { //Pedir y validar datos de la lista A
            System.out.println("Ingrese el valor " + (i+1) + " de la lista A");
            while (esInvalido) {
                if (sc.hasNextInt()) {
                    valoresA[i] = sc.nextInt();
                    esInvalido = false;
                    sc.nextLine();
                } else {
                    System.out.println("El valor debe ser un entero");
                    sc.nextLine();
                }
            }
            esInvalido = true;
        }
            for (int i = 0; i < 5; i++) { //Pedir y validar datos de la lista B
            System.out.println("Ingrese el valor " + (i+1) + " de la lista B");
            while (esInvalido) {
                if (sc.hasNextInt()) {
                    valoresB[i] = sc.nextInt();
                    esInvalido = false;
                    sc.nextLine();
                } else {
                    System.out.println("El valor debe ser un entero");
                    sc.nextLine();
                }
            }
            esInvalido = true;
        }
        for (int i = 0; i < 5; i++) { //Calcular la lista C
            valoresC[i] = valoresA[i] + valoresB[i];
        }
        System.out.print ("Lista A: ");
        for (int i = 0; i < 5; i++) { //Mostrar la lista A
            System.out.print(valoresA[i] + " ");
        }
        System.out.print("\nLista B: ");
        for (int i = 0; i < 5; i++) { //Mostrar la lista B
            System.out.print(valoresB[i] + " ");
        }
        System.out.println();
        System.out.print("Lista C: ");
        for (int i = 0; i < 5; i++) { //Mostrar la lista C
            System.out.print(valoresC[i] + " ");
        }
        int sumatoria = 0;
        for (int i = 0; i < 5; i++) {
            sumatoria += valoresC[i];
        }
        System.out.println("Suma: " + sumatoria);
    }
}
