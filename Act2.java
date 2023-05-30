import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        String nombre;
        int[] calificaciones = new int[5];
        Scanner num = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de cálculo de Evaluaciones");
        System.out.println("Ingresa tu nombre: ");
        nombre = num.nextLine();
        System.out.println("Ingresa las calificaciones de tus materias");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i+1) + ": ");
            calificaciones[i] = num.nextInt();
        }
        imprime(nombre, promedio(calificaciones), calificacion(promedio(calificaciones)), calificaciones);
    }

    public static double promedio(int[] calificaciones) {
        double total = 0;
        double promedio;

        for (int calificacion : calificaciones) {
            total += calificacion;
        }
        promedio = total / calificaciones.length;
        return promedio;
    }

    public static char calificacion(double promedio) {
        if (promedio >= 91) {
            return 'A';
        } else if (promedio >= 81) {
            return 'B';
        } else if (promedio >= 71) {
            return 'C';
        } else if (promedio >= 61) {
            return 'D';
        } else if (promedio >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static void imprime(String nombre, double promedio, char calif, int[] calificaciones) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i+1) + ":" + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calif);
    }
}
