import java.util.Scanner;

public class EjemplosJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el precio de un producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese su inicial: ");
        char inicial = scanner.next().charAt(0);

        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        // Mostrar valores ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + esEstudiante);

        // Operaciones básicas
        int suma = edad + 5;
        double division = precio / 2;
        int modulo = edad % 3;

        System.out.println("\nOperaciones:");
        System.out.println("Suma (edad + 5): " + suma);
        System.out.println("División (precio / 2): " + division);
        System.out.println("Módulo (edad % 3): " + modulo);

        // Evaluación de condiciones
        boolean mayorDeEdad = edad >= 18;
        boolean descuento = precio > 50 && esEstudiante;

        System.out.println("\nEvaluaciones:");
        System.out.println("Mayor de edad: " + mayorDeEdad);
        System.out.println("Tiene descuento: " + descuento);

        // Menú de opciones para estructuras de control
        System.out.println("\nSeleccione una opcion:");
        System.out.println("1. Evaluar mayoria de edad");
        System.out.println("2. Calificacion");
        System.out.println("3. Contar del 1 al 5");
        System.out.println("4. Contar hacia atrás desde 5");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                if (mayorDeEdad) {
                    System.out.println("Eres mayor de edad.");
                } else {
                    System.out.println("Eres menor de edad.");
                }
                break;
            case 2:
                System.out.print("Ingrese su calificacion (A, B, C, D): ");
                char calificacion = scanner.next().charAt(0);
                switch (calificacion) {
                    case 'A':
                        System.out.println("Excelente");
                        break;
                    case 'B':
                        System.out.println("Bueno");
                        break;
                    case 'C':
                        System.out.println("Regular");
                        break;
                    default:
                        System.out.println("Reprobado");
                }
                break;
            case 3:
                System.out.println("Contando del 1 al 5:");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
                break;
            case 4:
                int contador = 5;
                System.out.println("Contando hacia atras desde 5:");
                while (contador > 0) {
                    System.out.println(contador);
                    contador--;
                }
                break;
            default:
                System.out.println("Opcion no válida.");
        }

        scanner.close();
    }
}

