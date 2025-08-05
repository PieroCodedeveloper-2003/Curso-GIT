import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {
    public static void main(String[] args) {
        
        ArrayList<String> notas = new ArrayList<>(); // Lista para guardar las notas
        int opcion; // Variable para guardar la opción del menú

        // try-with-resources: el Scanner se cerrará automáticamente al finalizar el bloque
        try (Scanner entrada = new Scanner(System.in)) {
            // Menú que se repite hasta que el usuario elija salir (opción 4)
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Agregar nota");
                System.out.println("2. Ver notas");
                System.out.println("3. Eliminar nota");
                System.out.println("4. Salir");
                System.out.print("Seleccione opción: ");
                // Leer opción ingresada por el usuario
                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiar el salto de línea pendiente
                // Evaluamos la opción seleccionada usando switch con sintaxis moderna (Java 14+)
                switch (opcion) {
                    // Opción 1: Agregar una nota
                    case 1 -> {
                        System.out.print("Escribe tu nota: ");
                        String nota = entrada.nextLine();
                        notas.add(nota); // Agregar la nota a la lista
                        System.out.println("✅ Nota guardada.");
                    }
                    // Opción 2: Ver todas las notas guardadas
                    case 2 -> {
                        System.out.println("\n📋 Tus notas:");
                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println((i + 1) + ". " + notas.get(i));
                        }
                    }
                    // Opción 3: Eliminar una nota
                    case 3 -> {
                        System.out.print("Número de nota a eliminar: ");
                        int num = entrada.nextInt(); // Leer número de nota a eliminar
                        entrada.nextLine(); // Limpiar buffer
                        if (num >= 1 && num <= notas.size()) {
                            notas.remove(num - 1); // Eliminar la nota (ajustado al índice)
                            System.out.println("🗑️ Nota eliminada.");
                        } else {
                            System.out.println("❌ Número inválido.");
                        }
                    }
                    // Opción 4: Salir del programa
                    case 4 -> System.out.println("👋 ¡Hasta luego!");
                    // Opción no válida
                    default -> System.out.println("❌ Opción inválida.");
                }

            } while (opcion != 4); // Repetir mientras no elija salir
        }
    }
}
