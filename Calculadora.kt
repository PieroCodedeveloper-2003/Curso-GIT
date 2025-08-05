import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var opcion: Int // Variable para almacenar la opción del menú

    do {
        // Menú principal de opciones
        println("\n--- CALCULADORA PROFESIONAL ---")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Potencia (x^y)")
        println("6. Raíz cuadrada")
        println("7. Módulo")
        println("8. Salir")
        print("Selecciona una opción (1-8): ")

        // Lee la opción del usuario. Si no es válida, se asigna -1
        opcion = readLine()?.toIntOrNull() ?: -1

        // Estructura de decisión para ejecutar la opción elegida
        when (opcion) {
            1 -> {
                // Suma de dos números
                val a = pedirNumero("Primer número: ")
                val b = pedirNumero("Segundo número: ")
                println("Resultado: ${a + b}")
            }
            2 -> {
                // Resta de dos números
                val a = pedirNumero("Primer número: ")
                val b = pedirNumero("Segundo número: ")
                println("Resultado: ${a - b}")
            }
            3 -> {
                // Multiplicación de dos números
                val a = pedirNumero("Primer número: ")
                val b = pedirNumero("Segundo número: ")
                println("Resultado: ${a * b}")
            }
            4 -> {
                // División de dos números, validando que no se divida entre cero
                val a = pedirNumero("Dividendo: ")
                val b = pedirNumero("Divisor: ")
                if (b != 0.0) {
                    println("Resultado: ${a / b}")
                } else {
                    println("❌ No se puede dividir entre cero.")
                }
            }
            5 -> {
                // Potencia (x^y)
                val base = pedirNumero("Base: ")
                val exponente = pedirNumero("Exponente: ")
                println("Resultado: ${base.pow(exponente)}")
            }
            6 -> {
                // Raíz cuadrada, validando que el número no sea negativo
                val num = pedirNumero("Número: ")
                if (num >= 0) {
                    println("Resultado: ${sqrt(num)}")
                } else {
                    println("❌ No se puede calcular raíz de un número negativo.")
                }
            }
            7 -> {
                // Módulo o residuo, validando que el divisor no sea cero
                val a = pedirNumero("Dividendo: ")
                val b = pedirNumero("Divisor: ")
                if (b != 0.0) {
                    println("Resultado: ${a % b}")
                } else {
                    println("❌ No se puede calcular módulo con cero.")
                }
            }
            8 -> println("👋 ¡Hasta luego!") // Salida del programa
            else -> println("❌ Opción inválida.") // Opción incorrecta
        }

    } while (opcion != 8) // El ciclo se repite mientras no se elija salir
}

// Función para pedir un número al usuario y validar la entrada
fun pedirNumero(mensaje: String): Double {
    while (true) {
        print(mensaje)
        val entrada = readLine()
        val numero = entrada?.toDoubleOrNull()
        if (numero != null) return numero // Si el número es válido, se devuelve
        println("❌ Entrada inválida. Intenta de nuevo.") // Mensaje de error
    }
}
