import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {
    public static void main(String[] args) {
        
        // Entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        // Lista para guardar las notas
        ArrayList<String> notas = new ArrayList<>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar nota");
            System.out.println("2. Ver notas");
            System.out.println("3. Eliminar nota");
            System.out.println("4. Salir");
            System.out.print("\nElige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    // Agregar una nueva nota
                    System.out.print("Escribe tu nota: ");
                    String nota = entrada.nextLine();
                    notas.add(nota);
                    System.out.println("[Nota guardada]");
                    break;

                case 2:
                    // Mostrar todas las notas
                    System.out.println("\nTus notas:");
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas guardadas.");
                    } else {
                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println((i + 1) + ". " + notas.get(i));
                        }
                    }
                    break;

                case 3:
                    // Eliminar una nota por número
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas para eliminar.");
                    } else {
                        System.out.print("Número de nota a eliminar: ");
                        int num = entrada.nextInt();
                        entrada.nextLine(); // limpiar salto
                        if (num >= 1 && num <= notas.size()) {
                            notas.remove(num - 1);
                            System.out.println("[Nota eliminada]");
                        } else {
                            System.out.println("[Número inválido]");
                        }
                    }
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        entrada.close();
    }
}
