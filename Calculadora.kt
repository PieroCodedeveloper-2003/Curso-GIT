import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    // Variable para guardar la opción del menú
    var opcion = 0

    // Repite el menú hasta que el usuario elija salir
    while (opcion != 8) {
        println("\n--- CALCULADORA ---")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Potencia")
        println("6. Raíz cuadrada")
        println("7. Módulo")
        println("8. Salir")
        print("Elige una opción: ")
        opcion = readLine()?.toIntOrNull() ?: 0 // Lee la opción del usuario

        // Según la opción elegida, realiza una operación
        when (opcion) {

            // Suma
            1 -> {
                print("Número 1: ")
                val a = readLine()!!.toDouble()
                print("Número 2: ")
                val b = readLine()!!.toDouble()
                println("Resultado: ${a + b}")
            }

            // Resta
            2 -> {
                print("Número 1: ")
                val a = readLine()!!.toDouble()
                print("Número 2: ")
                val b = readLine()!!.toDouble()
                println("Resultado: ${a - b}")
            }

            // Multiplicación
            3 -> {
                print("Número 1: ")
                val a = readLine()!!.toDouble()
                print("Número 2: ")
                val b = readLine()!!.toDouble()
                println("Resultado: ${a * b}")
            }

            // División con validación de cero
            4 -> {
                print("Dividendo: ")
                val a = readLine()!!.toDouble()
                print("Divisor: ")
                val b = readLine()!!.toDouble()
                if (b != 0.0)
                    println("Resultado: ${a / b}")
                else
                    println("No se puede dividir entre cero.")
            }

            // Potencia
            5 -> {
                print("Base: ")
                val base = readLine()!!.toDouble()
                print("Exponente: ")
                val exp = readLine()!!.toDouble()
                println("Resultado: ${base.pow(exp)}")
            }

            // Raíz cuadrada con validación
            6 -> {
                print("Número: ")
                val num = readLine()!!.toDouble()
                if (num >= 0)
                    println("Resultado: ${sqrt(num)}")
                else
                    println("No se puede calcular raíz negativa.")
            }

            // Módulo
            7 -> {
                print("Dividendo: ")
                val a = readLine()!!.toDouble()
                print("Divisor: ")
                val b = readLine()!!.toDouble()
                if (b != 0.0)
                    println("Resultado: ${a % b}")
                else
                    println("No se puede dividir entre cero.")
            }

            // Salir
            8 -> println("¡Hasta luego!")

            // Opción inválida
            else -> println("Opción inválida.")
            
        }
    }
}
